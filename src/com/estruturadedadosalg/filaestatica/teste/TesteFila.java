package com.estruturadedadosalg.filaestatica.teste;

import com.estruturadedadosalg.filaestatica.Fila;

public class TesteFila {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(5);
		fila.enfileira(7);
		
		System.out.println(fila);
		
		fila.desenfileira();
		fila.desenfileira();
		
		System.out.println(fila);
		
		System.out.println("Espiar primeiro elemento: " + fila.espiar());
	}
}
