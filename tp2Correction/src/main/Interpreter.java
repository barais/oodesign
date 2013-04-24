package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import tp6.analysis.Analysis;
import tp6.node.AAssignment;
import tp6.node.ABinexpression;
import tp6.node.ABlock;
import tp6.node.AConditional;
import tp6.node.ADiviserOperatorarith;
import tp6.node.AEqualOperatorlogique;
import tp6.node.AInfOperatorlogique;
import tp6.node.AIntegervalue;
import tp6.node.AMinusOperatorarith;
import tp6.node.AModuloOperatorarith;
import tp6.node.AMultiplierOperatorarith;
import tp6.node.APlusOperatorarith;
import tp6.node.APrintS;
import tp6.node.AReadS;
import tp6.node.ASupOperatorlogique;
import tp6.node.AVariableref;
import tp6.node.AWhileS;
import tp6.node.PStatement;


public class Interpreter extends AbstractInterpreter implements Analysis {

	private Map<String, Integer> variables = new HashMap<String, Integer>();
	private Stack<Integer> lastValue= new Stack<Integer>();
	
	@Override
	public void caseAAssignment(AAssignment node) {
		
		node.getRhs().apply(this);
		variables.put(((AVariableref)node.getVar()).getIdentifier().getText(),lastValue.pop() );
 		
	}



	@Override
	public void caseABinexpression(ABinexpression node) {
		node.getLExp().apply(this);
		//System.out.println(node.getLExp());
		//System.out.println(variables.get("N"));
		
		node.getRExp().apply(this);
		node.getOperator().apply(this);
		
		
	}


	@Override
	public void caseABlock(ABlock node) {
		for (PStatement p : node.getStatement()){			
			p.apply(this);
		}
	}


	

	@Override
	public void caseAConditional(AConditional node) {
		node.getCond().apply(this);
		int val = lastValue.pop();
		if (val==0){
			node.getThenpart().apply(this);
		}else{
			node.getElsepart().apply(this);			
		}
		
	}


	@Override
	public void caseAEqualOperatorlogique(AEqualOperatorlogique node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		if (left==right)
			lastValue.push(0);
		else
			lastValue.push(-1);
	}



	@Override
	public void caseAInfOperatorlogique(AInfOperatorlogique node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		if (left<right)
			lastValue.push(0);
		else
			lastValue.push(-1);
	}

	@Override
	public void caseAIntegervalue(AIntegervalue node) {
		//System.out.println(node.getNumber().getText());
		lastValue.push(Integer.parseInt(node.getNumber().getText()));
	}



	@Override
	public void caseAMinusOperatorarith(AMinusOperatorarith node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		lastValue.push(left - right);
	}

	@Override
	public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		lastValue.push(left * right);
		
	}



	@Override
	public void caseAPlusOperatorarith(APlusOperatorarith node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		lastValue.push(left + right);

		
	}

	@Override
	public void caseAPrintS(APrintS node) {
		node.getValue().apply(this);
		System.out.println(lastValue.pop());
		
	}


	@Override
	public void caseAReadS(AReadS node) {
		String ligne_lue=null; 
		try{ 
		InputStreamReader lecteur=new InputStreamReader(System.in); 
		BufferedReader entree=new BufferedReader(lecteur); 
		ligne_lue=entree.readLine(); 
		} 
		catch(IOException err){ 
			
			System.exit(0); 
		} 
		int Value = Integer.parseInt(ligne_lue);
		variables.put(((AVariableref)node.getVar()).getIdentifier().getText(),Value);
	}



	@Override
	public void caseASupOperatorlogique(ASupOperatorlogique node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		if (left>right)
			lastValue.push(0);
		else
			lastValue.push(-1);
		
	}

	

	@Override
	public void caseAVariableref(AVariableref node) {
		lastValue.push(variables.get(node.getIdentifier().getText()));
	}


	@Override
	public void caseAWhileS(AWhileS node) {
		node.getCond().apply(this);
		int val = lastValue.pop();
		while (val==0){
			node.getBody().apply(this);
			node.getCond().apply(this);
			val = lastValue.pop();
		}
	
	}


	

	@Override
	public void caseADiviserOperatorarith(ADiviserOperatorarith node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		lastValue.push(left/right);
	}

	@Override
	public void caseAModuloOperatorarith(AModuloOperatorarith node) {
		int right = lastValue.pop();
		int left = lastValue.pop();
		lastValue.push(left%right);
	}



}
