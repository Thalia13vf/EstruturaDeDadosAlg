package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Stack;

public class Exercicio6Simbolos {
	public static void main(String[] args) {
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		boolean balanceado = true;
		Stack<Character> stack = new Stack<>(); 
		char simbolo, topo;
		
		for(int i = 0; i < expressao.length(); i++) {
			simbolo = expressao.charAt(i);
			
			if(ABRE.indexOf(simbolo) > -1) {
				stack.push(simbolo);
			}else if(FECHA.indexOf(simbolo) > -1){
				if(stack.isEmpty()) {
					return false;
					//está vazia, está desbalanceada
				}
				else {
					topo = stack.pop();
					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
