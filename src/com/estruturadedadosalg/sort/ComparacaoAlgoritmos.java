package com.estruturadedadosalg.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.estruturadedadosalg.sort.bubble.BubbleSort;
import com.estruturadedadosalg.sort.insertion.InsertionSort;
import com.estruturadedadosalg.sort.quick.QuickSort;
import com.estruturadedadosalg.sort.selection.SelectionSort;

public class ComparacaoAlgoritmos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a op��o de algoritmo");
		int opcao = teclado.nextInt();
		Random gerador = new Random();
		int valorInicial = 100000;
		long inicio = 0, fim = 0;
		int vetor[] = new int[valorInicial];
		int c = 0;

		for(int i = valorInicial; i > 0; i--) {
			vetor[c] = i;
			c++;
		}

//		for(int i = 0; i < vetor.length; i++) {
//			vetor[i] = gerador.nextInt(10);
//		}
		System.out.println(Arrays.toString(vetor));

		if(opcao == 1) {
			BubbleSort sort = new BubbleSort();
			sort.setVetor(vetor);

			inicio = System.currentTimeMillis();
			sort.bubbleSort();
			fim = System.currentTimeMillis();

		}else if(opcao == 2) {
			SelectionSort selection = new SelectionSort();
			selection.setVetor(vetor);

			inicio = System.currentTimeMillis();
			selection.selectionSort();
			fim = System.currentTimeMillis();

		}else if(opcao == 3) {
			InsertionSort insertion = new InsertionSort();
			insertion.setVetor(vetor);

			inicio = System.currentTimeMillis();
			insertion.insertionSort();
			fim = System.currentTimeMillis();

		}else if(opcao == 4){
			QuickSort quick = new QuickSort();
			quick.setVetor(vetor);

			inicio = System.currentTimeMillis();
			quick.quickSort(0, vetor.length - 1);
			fim = System.currentTimeMillis();
		}

		System.out.println("O tempo do algoritmo " + opcao + " foi de " + (fim - inicio)/1000.0);
		teclado.close();

		/*Com 100 mil e com o vetor ordenado do maior para o menor: 
		 * 1= 7,3
		 * 2 = 6,9
		 * 3 = 10
		 * 
		 * Com 100 mil e n�meros aleatorios
		 * 1 = 26,58
		 * 2 = 5,72
		 * 3 = 5,46
		 * 4 = 0,238
		 * Com 150 mil e n�meros aleatorios
		 * 1 = 5,7
		 * 2 = 4,8 
		 * 3=  0,013
		 * Com 200 mil e n�meros aleatorios*/
	}
}
