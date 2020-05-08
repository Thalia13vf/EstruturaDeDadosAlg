package com.estruturadedadosalg.pilhaestatica.teste;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class TesteEmpilha {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i = 1; i <= 12; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println("Tamanho: " + pilha.tamanho());
	}
}
