package com.estruturadedadosalg.pilhaestatica.teste;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class TesteEstaVazia {
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println("Está vazia? " + pilha.estaVazia());
		
		pilha.empilha(33);
		
		System.out.println(pilha);
		System.out.println("Está vazia? " + pilha.estaVazia());
	}
}
