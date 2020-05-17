package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Stack;

public class Exercicio4 {
	public static void main(String[] args) {
		Stack<Livro> pilha = new Stack<Livro>();
		
		Livro livro1 = new Livro("Hp", "Jk", 2000);
		Livro livro2 = new Livro("Origem das espécies","Darwin",1800);
		Livro livro3 = new Livro("Hp2","Jk",2001);
		Livro livro4 = new Livro("Hp3","Jk", 2002);
		Livro livro5 = new Livro("Hp4","Jk",2003);
		Livro livro6 = new Livro("Hp5", "JK", 2004);
		
		System.out.println("Pilha criada, está vazia? " + pilha.isEmpty());
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);
		
		System.out.println("Tamanho: " + pilha.size());
		System.out.println("Capacidade: " + pilha.capacity());
		
		System.out.println("Objeto do topo: "+pilha.peek());
		
		
		while(!pilha.isEmpty()) {
			System.out.println("Desempilhando o livro " + pilha.pop());
		}
		
		System.out.println(pilha);
		
	}
}
