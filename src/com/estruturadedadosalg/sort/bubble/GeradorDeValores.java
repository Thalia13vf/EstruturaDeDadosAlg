package com.estruturadedadosalg.sort.bubble;

import java.util.Scanner;

public class GeradorDeValores {
	
	public static int vetor[];
	
	public static boolean pertence(int valor, int tamanho) {
		for(int i = 0; i < tamanho; i++) {
			if(vetor[i] == valor) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = teclado.nextInt();
		
		vetor = new int[tamanho];
		System.out.println("Tamanho do vetor " + vetor.length);
		int valor, posicao;
		
		for(posicao = 0; posicao < vetor.length; posicao++) {
			do {
				valor = (int) (Math.random() * 100000) % 100000;
			}while(pertence(valor, posicao));
			vetor[posicao] = valor;
		}
		
		for(posicao = 0; posicao < vetor.length; posicao++) {
			System.out.println(vetor[posicao]);
		}
	}
}
