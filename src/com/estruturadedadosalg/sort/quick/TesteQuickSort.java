package com.estruturadedadosalg.sort.quick;

import java.util.Arrays;

public class TesteQuickSort {
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		//int[] vetor = {25, 57, 48, 37, 12, 92, 33};
		
		int[] vetor = {25, 57, 48, 12};
		
		sort.setVetor(vetor);
		
		sort.quickSort(0, vetor.length - 1);
		System.out.println(Arrays.toString(vetor));
	}
}
