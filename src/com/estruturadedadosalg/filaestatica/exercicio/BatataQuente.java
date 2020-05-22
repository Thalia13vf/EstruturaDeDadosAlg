package com.estruturadedadosalg.filaestatica.exercicio;

import java.util.Random;

import com.estruturadedadosalg.filaestatica.Fila;

public class BatataQuente {
	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		Random numAleatorio = new Random();
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(5);
		fila.enfileira(6);
		fila.enfileira(2);
		
		while(fila.tamanho() > 1) {
			int num = numAleatorio.nextInt(3);
			if(num == 1) {
				System.out.println("...Queimou " + fila.desenfileira());
				System.out.println();
			}else {
				fila.enfileira(fila.desenfileira());
				System.out.println("Batata quente, quente, quente");
			}
			
		}
		System.out.println("Vencedor: " + fila);
		
	}
}
