package com.estruturadedadosalg.buscabinaria.exercicio;

import java.util.Scanner;

public class UriOnlineJudge1025 {

	public static int[] ordena(int[] array) {
		int temporaria = 0;
		int valorInicial;
		int posicaoMenor;
		int c;
		
		for(int i = 0; i < array.length - 1; ) { //pega cada posição para comparar com as outras
			valorInicial = array[i];
			
			for(c = i + 1; c < array.length; c++) { //pega as próximas posições
				if(valorInicial < array[c]) {
					posicaoMenor = c; // Pega a posição do menor valor
					System.out.println("Menor posição " + posicaoMenor);
				}
			}

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

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] marmores;

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
			ordena(marmores);

			System.out.println("CASE# " + caso + ": ");
			for(int con = 0; con < q; con++) {
				int consulta = teclado.nextInt();

				int resultado = consultar(consulta, marmores);

				if(resultado != -1) {
					System.out.println(consulta + " found at " + (resultado + 1));
				}else {
					System.out.println(consulta + " not found");
				}
				caso++;
			}
		}

		teclado.close();
	}
}
