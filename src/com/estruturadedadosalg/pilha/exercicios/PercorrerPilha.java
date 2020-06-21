package com.estruturadedadosalg.pilha.exercicios;

import java.util.Stack;

public class PercorrerPilha {
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		Stack<Integer> par = new Stack<>();
		Stack<Integer> impar = new Stack<>();
		
		for(int i = 0; i <= 10; i++) {
			pilha.add(i);
		}
		
		System.out.println(pilha);
		
		while(!pilha.isEmpty()) {
			int topo = pilha.pop();
			if(topo % 2 == 0) {
				par.push(topo);
			}else {
				impar.push(topo);
			}
		}
		
		System.out.println("Pilha " + pilha);
		System.out.println("Par " + par);
		System.out.println("Ímpar " + impar);
		
	}
}
