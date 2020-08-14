package com.estruturadedadosalg.sort.quick;

import java.util.Arrays;

public class QuickSort {
	private int[] vetor;

	public int partition(int inicio, int fim) { //encontrar pivo
		int referencia; //piv�
		int up, down, temporaria;

		referencia = vetor[inicio]; //A referncia � o 1� elemento do vetor
		down = inicio; //avan�ar o down enquanto n�o tiver um num maior que o pivo
		up = fim; //retroceder enquanto n�o encontrar um menor que o pivo

		while(down < up) {
			while(vetor[down] <= referencia && down < fim) {
				down++; //avan�a para encontrar um valor maior 
			}

			while(vetor[up] > referencia) { //encontra o valor menor que a referencia 
				up--;
			}

			if(down < up) { // Se up e down n�o se cruzaram no vetor, troca
				temporaria = vetor[down];
				vetor[down] = vetor[up];
				vetor[up] = temporaria;
			}
		}

		vetor[inicio] = vetor[up];
		vetor[up] = referencia;
		
		return up; //A posi��o de up � onde est� o piv�
	}
	
	public void quickSort(int inicio, int fim) {
		int pivo;
		if(inicio > fim) {
			return;
		}
		pivo = this.partition(inicio, fim);
		System.out.println("Pivo " + pivo);
		quickSort(inicio, pivo - 1); //direita
		quickSort(pivo + 1, fim); //esquerda
		
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}


}
