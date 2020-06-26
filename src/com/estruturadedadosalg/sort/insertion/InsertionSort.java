package com.estruturadedadosalg.sort.insertion;

public class InsertionSort {
	private int[] vetor;
	
	public void insertionSort() {
		int cartaAtual, j;
		int iteracao; //começa na posição 1 e vai o final
		
		for(iteracao = 1; iteracao < vetor.length; iteracao++) {
			cartaAtual = vetor[iteracao];
			for(j = iteracao - 1; (j >= 0) && vetor[j] > cartaAtual ; j--) {
				vetor[j + 1] = vetor[j];
			}
			vetor[j + 1] = cartaAtual;
		}
		
	}

	public void mostraVetor() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("");
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	
}
