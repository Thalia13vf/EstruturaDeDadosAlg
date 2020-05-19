package com.estruturadedadosalg.filaestatica.teste;

import com.estruturadedadosalg.filaestatica.Fila;

public class TesteEnfileira {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila);
	}
}
