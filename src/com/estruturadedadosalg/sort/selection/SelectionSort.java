package com.estruturadedadosalg.sort.selection;

public class SelectionSort {
	private int[] vetor;

	public void selectionSort() {
		int iteracao;
		int posicaoMenor;
		int posicaoMenorInicial;
		int i;
		int temporaria;
		for(iteracao = 0; iteracao < vetor.length - 1; iteracao++) {
			posicaoMenorInicial = iteracao;
			posicaoMenor = iteracao + 1;
			for(i = posicaoMenorInicial + 1; i < vetor.length; i++) { 
				//for para encontrar a menor posição
				if(vetor[i] < vetor[posicaoMenor]) {
					posicaoMenor = i;
				}
			}
			if(vetor[posicaoMenor] < vetor[posicaoMenorInicial]) {
				temporaria = vetor[posicaoMenorInicial];
				vetor[posicaoMenorInicial] = vetor[posicaoMenor];
				vetor[posicaoMenor] = temporaria;
			}
		}
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	public void mostraVetor() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("");
	}
	
}
