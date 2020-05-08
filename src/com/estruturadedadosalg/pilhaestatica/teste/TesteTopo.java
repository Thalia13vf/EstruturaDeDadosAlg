package com.estruturadedadosalg.pilhaestatica.teste;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class TesteTopo {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
		pilha.empilha(1);
		pilha.empilha(2);
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
		pilha.empilha(3);
		
		System.out.println(pilha.topo());
	}
}
