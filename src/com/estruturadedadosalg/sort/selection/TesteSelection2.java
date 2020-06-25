package com.estruturadedadosalg.sort.selection;

public class TesteSelection2 {
	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		int[] vetor = new int[50000];
		
		for(int i = 0; i < 50000; i++) {
			vetor[i] = (int) (Math.random() * 100) % 100;
		}
		
		selection.setVetor(vetor);
		
		long inicio = System.currentTimeMillis();
		selection.selectionSort();
		long fim = System.currentTimeMillis();

		System.out.println("Tempo " + (fim - inicio)/1000.0);
	}
}
