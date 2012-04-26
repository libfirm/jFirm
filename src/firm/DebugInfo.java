package firm;

import java.util.ArrayList;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * Convenience class that helps constructing debug info that can be attached
 * to firm nodes.
 */
public final class DebugInfo {
	private final static int BLOCK_SIZE = 2048;
	private final static ArrayList<Memory> memoryBlocks = new ArrayList<Memory>();
	private static Memory currentMemory;
	private static int currentIdx;

	public static class SrcLog extends Structure {
		public Pointer file;
		public int line;
		public int column;

		public SrcLog(Pointer p) {
			super(p);
		}
		public SrcLog() {
		}

		public static class ByValue extends SrcLog implements Structure.ByValue {
			public ByValue() {
			}
			public ByValue(Pointer p) {
				super(p);
			}
		}

		public final static int SIZE;

		static {
			SrcLog log = new SrcLog();
			SIZE = log.size();
		}
	};

	private interface binding_dbginfo extends Library {

		interface RetrieveDbgFunc extends Callback {
			SrcLog.ByValue callback(Pointer dbg);
		}

		void ir_set_debug_retrieve(RetrieveDbgFunc handler);
		Pointer get_id_str(Pointer ident);
	}
	private static binding_dbginfo binding_dbg;

	private static SrcLog.ByValue nullSrc;
	static {
		nullSrc = new SrcLog.ByValue();
		nullSrc.write();
	}

	private static final binding_dbginfo.RetrieveDbgFunc handler = new binding_dbginfo.RetrieveDbgFunc() {
		@Override
		public SrcLog.ByValue callback(Pointer dbg) {
			if (dbg == null)
				return nullSrc;
			SrcLog.ByValue log = new SrcLog.ByValue(dbg);
			return log;
		}
	};

	public static void init() {
		/* already initialized? */
		if (currentMemory != null)
			return;

		if (binding_dbg == null) {
			binding_dbg = (binding_dbginfo) Native.loadLibrary("firm",
					binding_dbginfo.class);
		}
		binding_dbg.ir_set_debug_retrieve(handler);
		allocateMemoryBlock();
	}

	/**
	 * Create a dbg_info pointer which can be attached to firm nodes to indicate
	 * source position.
	 * @param source  name of the source (typically the filename)
	 * @param line    line in the source starting with 1 or 0 if unknown
	 * @param column  column in the source starting with 1 or 0 if unknown
	 * @return dbg_info pointer
	 */
	public static Pointer createInfo(String source, int line, int column) {
		if (currentIdx + SrcLog.SIZE >= BLOCK_SIZE) {
			allocateMemoryBlock();
		}
		/* TODO: align the index? */
		Pointer result = currentMemory.share(currentIdx);
		SrcLog log = new SrcLog(result);
		Ident ident = new Ident(source);
		log.file = binding_dbg.get_id_str(ident.ptr);
		log.line = line;
		log.column = column;
		log.write();
		currentIdx += SrcLog.SIZE;
		return result;
	}

	private static void allocateMemoryBlock() {
		if (currentMemory != null)
			memoryBlocks.add(currentMemory);
		currentMemory = new Memory(BLOCK_SIZE);
		currentIdx = 0;
	}
}
