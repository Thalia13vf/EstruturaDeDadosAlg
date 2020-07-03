package com.estruturadedadosalg.sort.selection;

public class TesteSelectionSort {
	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		int[] vetor = {25, 57, 48, };
		//37, 12, 92, 33
		
		selection.setVetor(vetor);
		selection.selectionSort();
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
	}
}
