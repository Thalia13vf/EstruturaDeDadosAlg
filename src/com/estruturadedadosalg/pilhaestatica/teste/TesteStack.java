package com.estruturadedadosalg.pilhaestatica.teste;

import java.util.Stack;

public class TesteStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Está vazia? " + stack.isEmpty());
		
		//empilhar
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Está vazia? " + stack.isEmpty());
		System.out.println("Tamanho: "+stack.size());
		System.out.println(stack);
		
		System.out.println("No topo: " + stack.peek());
		
		//retorna e exclui o elemento
		System.out.println("Desempilha o " + stack.pop());
		
		System.out.println(stack);
	}
}
