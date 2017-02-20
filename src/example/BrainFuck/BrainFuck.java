package example.BrainFuck;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.sun.jna.Platform;

import firm.ArrayType;
import firm.Construction;
import firm.Entity;
import firm.Graph;
import firm.Initializer;
import firm.MethodType;
import firm.Mode;
import firm.PrimitiveType;
import firm.Program;
import firm.Relation;
import firm.SegmentType;
import firm.Type;
import firm.bindings.binding_typerep.ir_visibility;
import firm.nodes.Block;
import firm.nodes.Call;
import firm.nodes.Cond;
import firm.nodes.Load;
import firm.nodes.Node;
import firm.nodes.Store;

public class BrainFuck {
	private static int DATA_SIZE = 1000;
	private Construction construction;
	private InputStream input;
	private Entity putcharEntity;
	private Entity getcharEntity;
	private Node putcharSymConst;
	private Node getcharSymConst;

	private static String makeLdIdent(String str) {
		if (Platform.isMac() || Platform.isWindows()) {
			str = "_" + str;
		}
		return str;
	}

	public Graph compile(String name) throws IOException {
		FileInputStream input = new FileInputStream(name);
		this.input = input;

		/* create a new entity for the main function */
		MethodType type = new MethodType(0, 0);
		SegmentType global = Program.getGlobalType();
		Entity mainEnt = new Entity(global, "main", type);
		mainEnt.setLdIdent(makeLdIdent("main"));

		/* create a new global array for the brainfuck data */
		PrimitiveType btype = new PrimitiveType(Mode.getBu());
		ArrayType atype = new ArrayType(btype, DATA_SIZE);
		atype.finishLayout();

		Entity data = new Entity(global, "data", atype);
		data.setLdIdent(makeLdIdent("data"));
		data.setVisibility(ir_visibility.ir_visibility_local);
		data.setInitializer(Initializer.getNull());

		/* create a graph */
		int n_vars = 1;
		Graph graph = new Graph(mainEnt, n_vars);
		construction = new Construction(graph);

		Node symconst = construction.newAddress(data);
		construction.setVariable(0, symconst);

		/* create putchar entity */
		PrimitiveType intType = new PrimitiveType(Mode.getIs());
		MethodType putcharType = new MethodType(new Type[] { intType },
				new Type[] { intType });

		putcharEntity = new Entity(global, "putchar", putcharType);
		putcharEntity.setLdIdent(makeLdIdent("putchar"));
		putcharSymConst = construction.newAddress(putcharEntity);

		/* create getchar entity */
		MethodType getcharType = new MethodType(new Type[] {},
				new Type[] { intType });

		getcharEntity = new Entity(global, "getchar", getcharType);
		getcharEntity.setLdIdent(makeLdIdent("getchar"));
		getcharSymConst = construction.newAddress(getcharEntity);

		while (input.available() > 0) {
			parse();
			if (input.available() > 0) {
				System.err.println("warning: unexpected ']' - ignoring");
			}
		}
		input.close();

		/* create return statement */
		Node nreturn = construction.newReturn(construction.getCurrentMem(),
				new Node[] {});
		graph.getEndBlock().addPred(nreturn);

		construction.finish();

		/* you could call optimisations here... */

		return graph;
	}

	private void parse() throws IOException {
		while (input.available() > 0) {
			int c = input.read();
			switch (c) {
			case '>':
				changePointer(1);
				break;
			case '<':
				changePointer(-1);
				break;
			case '+':
				changeMemory(1);
				break;
			case '-':
				changeMemory(-1);
				break;
			case '.':
				outputByte();
				break;
			case ',':
				inputByte();
				break;
			case '[':
				parseLoop();
				break;
			case ']':
				return;
			default:
				break;
			}
		}
	}

	private void inputByte() {
		Node mem = construction.getCurrentMem();

		Node call = construction.newCall(mem, getcharSymConst, new Node[] {},
				getcharEntity.getType());
		Node callMem = construction.newProj(call, Mode.getM(), Call.pnM);
		Node callResults = construction.newProj(call, Mode.getT(),
				Call.pnTResult);
		Node result = construction.newProj(callResults, Mode.getIs(), 0);
		Node conv = construction.newConv(result, Mode.getBu());

		Node pointer = construction.getVariable(0, Mode.getP());
		Node store = construction.newStore(callMem, pointer, conv);
		Node storeMem = construction.newProj(store, Mode.getM(), Store.pnM);
		construction.setCurrentMem(storeMem);
	}

	private void parseLoop() throws IOException {
		Node jump = construction.newJmp();

		Block loopHeader = construction.newBlock();
		loopHeader.addPred(jump);
		construction.setCurrentBlock(loopHeader);

		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();

		Node load = construction.newLoad(mem, pointer, Mode.getBu());
		Node loadRes = construction.newProj(load, Mode.getBu(), Load.pnRes);
		Node loadMem = construction.newProj(load, Mode.getM(), Load.pnM);
		construction.setCurrentMem(loadMem);

		Node zero = construction.newConst(0, Mode.getBu());
		Node cmp = construction.newCmp(loadRes, zero, Relation.Equal);
		Node cond = construction.newCond(cmp);

		Node projTrue = construction.newProj(cond, Mode.getX(), Cond.pnTrue);
		Node projFalse = construction.newProj(cond, Mode.getX(), Cond.pnFalse);

		Block loopBody = construction.newBlock();
		loopBody.addPred(projFalse);

		construction.setCurrentBlock(loopBody);
		parse();
		if (input.available() == 0) {
			System.err.println("Parse Error: unmatched '['");
		}

		Node jmp2 = construction.newJmp();
		loopHeader.addPred(jmp2);

		Block afterLoop = construction.newBlock();
		afterLoop.addPred(projTrue);
		construction.setCurrentBlock(afterLoop);
	}

	private void outputByte() {
		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();

		Node load = construction.newLoad(mem, pointer, Mode.getBu());
		Node result = construction.newProj(load, Mode.getBu(), Load.pnRes);

		Node conv = construction.newConv(result, Mode.getIs());
		Node call = construction.newCall(mem, putcharSymConst,
				new Node[] { conv }, putcharEntity.getType());

		Node callMem = construction.newProj(call, Mode.getM(), Call.pnM);
		construction.setCurrentMem(callMem);
	}

	private void changeMemory(int delta_int) {
		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();

		Node load = construction.newLoad(mem, pointer, Mode.getBu());
		Node result = construction.newProj(load, Mode.getBu(), Load.pnRes);
		Node loadMem = construction.newProj(load, Mode.getM(), Load.pnM);

		Node delta = construction.newConst(Math.abs(delta_int), Mode.getBu());
		Node op;
		if (delta_int < 0) {
			op = construction.newSub(result, delta);
		} else {
			op = construction.newAdd(result, delta);
		}

		Node store = construction.newStore(loadMem, pointer, op);
		Node storeMem = construction.newProj(store, Mode.getM(), Store.pnM);
		construction.setCurrentMem(storeMem);
	}

	private void changePointer(int delta_int) {
		Mode offset_mode = Mode.getP().getReferenceOffsetMode();
		Node pointer = construction.getVariable(0, Mode.getP());
		Node delta = construction.newConst(delta_int, offset_mode);
		Node add = construction.newAdd(pointer, delta);
		construction.setVariable(0, add);
	}
}
