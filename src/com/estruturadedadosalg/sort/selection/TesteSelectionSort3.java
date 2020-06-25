package com.estruturadedadosalg.sort.selection;

import java.util.Arrays;

import com.estruturadedadosalg.sort.bubble.BubbleSort;

public class TesteSelectionSort3 {
	public static void main(String[] args) {
		int valorInicial = 10;
		int opcao = 2;
		int vetor[] = new int[valorInicial];
		int c = 0;
		
		for(int i = valorInicial; i > 0; i--) {
			vetor[c] = i;
			c++;
		}
		
		System.out.println(Arrays.toString(vetor));
		
		if(opcao == 1) {
			BubbleSort sort = new BubbleSort();
			sort.setVetor(vetor);
			sort.bubbleSort();
			sort.mostraVetor();
		}else if(opcao == 2) {
			SelectionSort selection = new SelectionSort();
			selection.setVetor(vetor);
			selection.selectionSort();
			selection.mostraVetor();
		}
	}
}
