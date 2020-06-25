package com.estruturadedadosalg.sort.bubble;
import java.util.Scanner;

public class TesteBubbleSort {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[teclado.nextInt()];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100) % 100;
		}
		
		BubbleSort alg = new BubbleSort();
		
		alg.setVetor(vetor);
		long inicio = System.currentTimeMillis();
		alg.bubbleSort();
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução " + (fim - inicio) / 1000.0);
		
		System.out.println("Mostra vetor ");
		System.out.println();
//		
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.print(vetor[i] + " ");
//		}
		
	}
}
