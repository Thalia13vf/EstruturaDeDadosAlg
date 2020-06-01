package com.estruturadedadosalg.pilha.teste;

import com.estruturadedadosalg.pilha.Pilha;

public class TesteInsereRemove {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		pilha.insere(1);
		pilha.insere(2);
		pilha.insere(3);
		
		System.out.println(pilha);
		
		System.out.println("Topo " + pilha.topo());
		System.out.println("Removendo " + pilha.remove());
		System.out.println("Topo " + pilha.topo());
		
		System.out.println("Tamanho da pilha: " + pilha.tamanho());
	}
}
