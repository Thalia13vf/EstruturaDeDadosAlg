package com.estruturadedadosalg.sort.insertion;

import java.util.Arrays;

public class TesteInsertionSort2 {
	public static void main(String[] args) {
		int[] vetor = {8, 0, 5, 2, 1};
		int numero;
		int i, c;
		
		for(i = 1; i < vetor.length; i++) {
			numero = vetor[i];	
			System.out.println("O número é " + numero);
			for(c = i -1; (c >= 0) && vetor[c] > numero; c--) {
				System.out.println("--> Comparando com " + vetor[c]);
				vetor[c + 1] = vetor[c];
			}
			vetor[c + 1] = numero;
		}
		
		System.out.println(Arrays.toString(vetor));
	}
}
