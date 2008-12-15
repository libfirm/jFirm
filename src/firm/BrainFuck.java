package firm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import firm.bindings.binding_ircons.cons_flags;
import firm.bindings.binding_typerep.ir_type_state;
import firm.bindings.binding_typerep.ir_visibility;
import firm.nodes.Add;
import firm.nodes.Block;
import firm.nodes.Call;
import firm.nodes.Cmp;
import firm.nodes.Cond;
import firm.nodes.Const;
import firm.nodes.Conv;
import firm.nodes.Jmp;
import firm.nodes.Load;
import firm.nodes.Node;
import firm.nodes.Proj;
import firm.nodes.Return;
import firm.nodes.Store;
import firm.nodes.SymConst;

public class BrainFuck {
	private static int DATA_SIZE = 1000;
	private Construction construction;
	private InputStream input;
	private Entity putcharEntity;
	private Entity getcharEntity;
	private SymConst putcharSymConst;
	private SymConst getcharSymConst;
	
	public BrainFuck() {
	}
	
	public Graph compile(String name) throws IOException {
		FileInputStream input = new FileInputStream(name);
		this.input = input;
		
		/* create a new entity for the main function */
		Ident ident = new Ident("main");
		MethodType type = new MethodType(new Ident("V()"), 0, 0);
		Type global = Program.getGlobalType();
		Entity mainEnt = new Entity(global, ident, type);
		mainEnt.setLdIdent(ident);
		mainEnt.setVisibility(ir_visibility.visibility_external_visible);
		
		/* create a new global array for the brainfuck data */
		PrimitiveType btype = new PrimitiveType(new Ident("type_byte"), Mode.getBu());
		ArrayType     atype = new ArrayType(new Ident("type_array"), 1, btype);
		atype.setBounds(0, 0, DATA_SIZE);
		atype.setSizeBytes(DATA_SIZE);
		atype.setTypeState(ir_type_state.layout_fixed);
		
		Type globalType = Program.getGlobalType();
		Entity data = new Entity(globalType, new Ident("data"), atype);
		data.setVisibility(ir_visibility.visibility_local);
		
		/* create a graph */
		int n_vars = 1;
		Graph graph = new Graph(mainEnt, n_vars);
		construction = new Construction(graph);
		
		SymConst symconst = construction.newSymConst(data);
		construction.setVariable(0, symconst);
		
		/* create putchar entity */
		PrimitiveType intType = new PrimitiveType(new Ident("type_ind"), Mode.getIs());
		MethodType putcharType = new MethodType(new Ident("putchar_type"), 1, 1);
		putcharType.setParamType(0, intType);
		putcharType.setResType(0, intType);
		
		putcharEntity = new Entity(globalType, new Ident("putchar"), putcharType);
		putcharEntity.setVisibility(ir_visibility.visibility_external_allocated);
		putcharEntity.setLdIdent(new Ident("putchar"));
		putcharSymConst = construction.newSymConst(putcharEntity);
		
		/* create getchar entity */
		MethodType getcharType = new MethodType(new Ident("getchar_type"), 0, 1);
		getcharType.setResType(0, intType);
		
		getcharEntity = new Entity(globalType, new Ident("getchar"), getcharType);
		getcharEntity.setVisibility(ir_visibility.visibility_external_allocated);
		getcharEntity.setLdIdent(new Ident("getchar"));
		getcharSymConst = construction.newSymConst(getcharEntity); 
				
		while (true) {
			parse();
			if (input.available() > 0) {
				System.err.println("warning: unexpected ']' - ignoring");
				continue;
			}
			break;
		}
		input.close();
		
		/* create return statement */
		Return nreturn = construction.newReturn(construction.getCurrentMem(), new Node[] {});
		graph.getEndBlock().addPred(nreturn);
		
		construction.finish();
		
		/* TODO: call optimisations here... */
		
		return graph;
	}

	private void parse() throws IOException {
		while(input.available() > 0) {
			int c = input.read();
			switch(c) {
			case '>': changePointer(1); break;
			case '<': changePointer(-1); break;
			case '+': changeMemory(1); break;
			case '-': changeMemory(-1); break;
			case '.': outputByte(); break;
			case ',': inputByte(); break;
			case '[': parseLoop(); break;
			case ']': return;
			default: break;
			}
		}
	}

	private void inputByte() {
		Node mem = construction.getCurrentMem();
		
		Call call = construction.newCall(mem, getcharSymConst, new Node[] {}, getcharEntity.getType());
		Proj callMem = construction.newProj(call, Mode.getM(), Call.pnMRegular);
		Proj callResults = construction.newProj(call, Mode.getT(), Call.pnTResult);
		Proj result = construction.newProj(callResults, Mode.getIs(), 0);
		Conv conv = construction.newConv(result, Mode.getBu());
		
		Node pointer = construction.getVariable(0, Mode.getP());
		Store store = construction.newStore(callMem, pointer, conv, cons_flags.cons_none);
		Proj storeMem = construction.newProj(store, Mode.getM(), Store.pnM);
		construction.setCurrentMem(storeMem);
	}

	private void parseLoop() throws IOException {
		Jmp jump = construction.newJmp();
		
		Block loopHeader = construction.newBlock();
		loopHeader.addPred(jump);
		construction.setCurrentBlock(loopHeader);
		
		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();
		
		Load load = construction.newLoad(mem, pointer, Mode.getBu(), cons_flags.cons_none);
		Proj loadRes = construction.newProj(load, Mode.getBu(), Load.pnRes);
		Proj loadMem = construction.newProj(load, Mode.getM(), Load.pnM);
		construction.setCurrentMem(loadMem);
		
		Const zero = construction.newConst(0, Mode.getBu());
		Cmp cmp = construction.newCmp(loadRes, zero);
		Proj pEqual = construction.newProj(cmp, Mode.getb(), Cmp.pnEq);
		Cond cond = construction.newCond(pEqual);
		
		Proj projTrue = construction.newProj(cond, Mode.getX(), Cond.pnTrue);
		Proj projFalse = construction.newProj(cond, Mode.getX(), Cond.pnFalse);
		
		Block loopBody = construction.newBlock();
		loopBody.addPred(projFalse);
		
		construction.setCurrentBlock(loopBody);
		parse();
		if (input.available() == 0) {
			System.err.println("Parse Error: unmatched '['");
		}
		
		Jmp jmp2 = construction.newJmp();
		loopHeader.addPred(jmp2);
		
		Block afterLoop = construction.newBlock();
		afterLoop.addPred(projTrue);
		construction.setCurrentBlock(afterLoop);
	}

	private void outputByte() {
		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();
		
		Load load = construction.newLoad(mem, pointer, Mode.getBu(), cons_flags.cons_none);
		Proj result = construction.newProj(load, Mode.getBu(), Load.pnRes);
		
		Conv conv = construction.newConv(result, Mode.getIs());
		Call call = construction.newCall(mem, putcharSymConst, new Node[] {conv}, putcharEntity.getType());
		
		Node callMem = construction.newProj(call, Mode.getM(), Call.pnMRegular);
		construction.setCurrentMem(callMem);
	}

	private void changeMemory(int delta_int) {
		Node pointer = construction.getVariable(0, Mode.getP());
		Node mem = construction.getCurrentMem();
		
		Load load = construction.newLoad(mem, pointer, Mode.getBu(), cons_flags.cons_none);
		Proj result = construction.newProj(load, Mode.getBu(), Load.pnRes);
		Proj loadMem = construction.newProj(load, Mode.getM(), Load.pnM);
		
		Const delta = construction.newConst(Math.abs(delta_int), Mode.getBu());
		Node op;
		if (delta_int < 0)
			op = construction.newSub(result, delta, Mode.getBu());
		else
			op = construction.newAdd(result, delta, Mode.getBu());
		
		Store store = construction.newStore(loadMem, pointer, op, cons_flags.cons_none);
		Proj storeMem = construction.newProj(store, Mode.getM(), Store.pnM);
		construction.setCurrentMem(storeMem);
	}

	private void changePointer(int delta_int) {
		Node pointer = construction.getVariable(0, Mode.getP());
		Const delta = construction.newConst(delta_int, Mode.getIs());
		Add add = construction.newAdd(pointer, delta, Mode.getP());
		construction.setVariable(0, add);
	}
}
