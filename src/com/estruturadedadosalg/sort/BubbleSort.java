package com.estruturadedadosalg.sort;

public class BubbleSort {
	private int vetor[] = {25, 57, 48, 37, 12, 92, 33};
	
	public void bubbleSort() {
		int iteracao;  // número de iterações 
		int posicao;
		int temporario; //para a troca
		
		for(iteracao = 0; iteracao < vetor.length - 1; iteracao++) {
			for(posicao = 0; posicao < vetor.length - iteracao - 1; posicao++) {
				//comparar o elemento da posição com o próximo
				if(vetor[posicao] > vetor[posicao + 1]) {
					temporario = vetor[posicao];
					vetor[posicao] = vetor[posicao + 1];
					vetor[posicao + 1] = temporario;
				}
			}
			System.out.println("----------- Final da iteração " + iteracao);
			mostraVetor();
		}
	}
	
	public void mostraVetor() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("");
	}
}
