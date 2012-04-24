package firm;

import java.util.ArrayList;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_ident;

/**
 * Convenience class that helps constructing debug info that can be attached
 * to firm nodes.
 */
public final class DebugInfo {
	private final static int BLOCK_SIZE = 2048;
	private final static ArrayList<Memory> memoryBlocks = new ArrayList<Memory>();
	private static Memory currentMemory;
	private static int currentIdx;

	private interface binding_dbginfo extends Library {

		interface RetrieveDbgFunc extends Callback {
			String callback(Pointer dbg, Pointer /* int* */line);
		}

		void ir_set_debug_retrieve(RetrieveDbgFunc handler);
	}
	private static binding_dbginfo binding_dbg;

	private static final binding_dbginfo.RetrieveDbgFunc handler = new binding_dbginfo.RetrieveDbgFunc() {
		@Override
		public String callback(Pointer dbg, Pointer line) {
			if (dbg == null)
				return null;
			Pointer ident = dbg.getPointer(0);
			int lineNr = dbg.getInt(Pointer.SIZE);
			if (!line.equals(Pointer.NULL)) {
				line.setInt(0, lineNr);
			}
			return binding_ident.get_id_str(ident);
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

	public static Pointer createInfo(Ident source, int line) {
		final int size = Pointer.SIZE + 4;
		if (currentIdx + size >= BLOCK_SIZE) {
			allocateMemoryBlock();
		}
		currentMemory.setPointer(currentIdx, source.ptr);
		currentMemory.setInt(currentIdx+Pointer.SIZE, line);
		Pointer result = currentMemory.share(currentIdx);
		currentIdx += size;
		return result;
	}

	public static Pointer createInfo(String source, int line) {
		final Ident ident = new Ident(source);
		return createInfo(ident, line);
	}

	private static void allocateMemoryBlock() {
		if (currentMemory != null)
			memoryBlocks.add(currentMemory);
		currentMemory = new Memory(BLOCK_SIZE);
		currentIdx = 0;
	}
}
