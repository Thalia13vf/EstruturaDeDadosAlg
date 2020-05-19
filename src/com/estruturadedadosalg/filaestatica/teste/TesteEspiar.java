package com.estruturadedadosalg.filaestatica.teste;

import com.estruturadedadosalg.filaestatica.Fila;

public class TesteEspiar {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(3);
		fila.enfileira(2);
		fila.enfileira(4);
		
		System.out.println(fila.espiar());
		
		System.out.println(fila);
	}
}
