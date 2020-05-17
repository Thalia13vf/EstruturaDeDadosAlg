package com.estruturadedadosalg.pilhaestatica.exercicios;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Exercicio3 {
	public static void main(String[] args) {
		Pilha<Livro> pilha = new Pilha<>(20);
		
		Livro livro1 = new Livro("Hp", "Jk", 2000);
		Livro livro2 = new Livro("Origem das espécies","Darwin",1800);
		Livro livro3 = new Livro("Hp2","Jk",2001);
		Livro livro4 = new Livro("Hp3","Jk", 2002);
		Livro livro5 = new Livro("Hp4","Jk",2003);
		Livro livro6 = new Livro("Hp5", "JK", 2004);
		
		System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.estaVazia());

		System.out.println("Empilhando livros na pilha:");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		
		System.out.println(pilha.tamanho() +" foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Topo da pilha: " + pilha.topo());
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
		System.out.println(pilha);
		
		System.out.println(pilha.tamanho());
		
	}
}
