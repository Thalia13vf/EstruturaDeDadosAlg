package com.estruturadedadosalg.buscabinaria.exercicio;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UriOnlineJudge1025 {

	public static int[] ordena(int[] array) {
		int numero;
		int i, c;

		for(i = 1; i < array.length; i++) {
			numero = array[i];

			for(c = i - 1; (c >= 0) && array[c] > numero; c--) {
				array[c + 1] = array[c];
			}
			array[c + 1] = numero;
		}

		return array;
	}

	public static int consultar(int n, int[] array) {
		int inicio, meio, fim;

		inicio = 0;
		fim = array.length - 1;

		while(inicio <= fim) {
			meio = (inicio + fim ) / 2;

			if(array[meio] == n) {
				return meio;
			}else if(n > array[meio]){
				inicio = meio + 1;
			}else{
				fim = meio - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int[] marmores;
		String res = "";
		int n;
		int q;
		int caso = 1;
		boolean testes = true;

		while(testes){
			n = teclado.nextInt();
			q = teclado.nextInt();

			if(n == 0 && q == 0) {
				break;
			}	
			marmores = new int[n];

			for(int c = 0; c < n; c++) {
				marmores[c] = teclado.nextInt();
			}
			System.out.println(Arrays.toString(ordena(marmores)));
			System.out.println("CASE# " + caso + ": ");
			for(int con = 0; con < q; con++) {
				int consulta = teclado.nextInt();

				int resultado = consultar(consulta, marmores);

				if(resultado != -1) {
					res = consulta + " found at " + (resultado + 1);
				}else {
					res = consulta + " not found";
				}

				System.out.println(res);
				caso++;
			}
		}

		teclado.close();
	}
}
