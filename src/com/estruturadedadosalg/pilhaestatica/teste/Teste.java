package com.estruturadedadosalg.pilhaestatica.teste;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Teste {
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println(pilha);
		System.out.println("Tamanho " + pilha.tamanho());
	}
}
