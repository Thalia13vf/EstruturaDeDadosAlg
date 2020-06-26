package com.estruturadedadosalg.sort.selection;
import java.util.Arrays;

public class TesteSelectionSort4 {
	public static int[] ordena(int[] array) {
		int temporaria = 0;
		int posicaoInicial;
		int posicaoMenor;
		int menorValor;
		int c;

		for(int i = 0; i < array.length - 1; i++) { //pega cada posição para comparar com as outras
			posicaoInicial = i;
			posicaoMenor = i;
			menorValor = array[i];

			for(c = i + 1; c < array.length; c++) { //pega as próximas posições
				if(array[c] < menorValor) {
					posicaoMenor = c; // Pega a posição do menor valor
					menorValor = array[c];
					System.out.println("Menor Valor " + menorValor);
				}
			}
			if(array[posicaoMenor] < array[posicaoInicial]) {
				temporaria = array[posicaoInicial]; 
				array[posicaoInicial] = array[posicaoMenor];
				array[posicaoMenor] = temporaria;
			}

		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = {9, 2, 4, 7, 12, 1, 0};
		ordena(array);
		System.out.println(Arrays.toString(array));
	}
}
