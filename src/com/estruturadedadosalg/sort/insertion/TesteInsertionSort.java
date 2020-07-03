package com.estruturadedadosalg.sort.insertion;

import java.util.Arrays;

public class TesteInsertionSort {
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] vetor = {8, 5, 2, 1};
		//25, 57, 48, 37, 12, 92, 33
		sort.setVetor(vetor);
		sort.insertionSort();
		
		System.out.println(Arrays.toString(vetor));
	}
}
