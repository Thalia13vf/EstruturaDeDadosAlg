package com.estruturadedadosalg.buscabinaria;

public class Colecao {
	//private int valores[] = {12, 56, 87, 23, 96, 43, 27, 76, 33, 11};
	private int valores[] = {11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };
	private int numeros[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	
	public int buscaSequencial(int valor) {
		int iteracoes = 0;
		int posicao;
		for(posicao = 0; posicao < valores.length; posicao++) {
			if(valor == valores[posicao]) {
				System.out.println("Itera��es " + iteracoes);
				return posicao;
			}
			iteracoes++;
		}
		System.out.println("Itera��es " + iteracoes);
		return -1;
	}
	
	public int buscaBinaria(int valor) {
		int meio, inicio, fim;
		inicio = 0; //primeira posi��o
		fim = valores.length - 1; //�ltima posi��o
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			if(valor == valores[meio]) { // o valor � igual ao que est� no meio
				return meio;
			}else {
				if(valor > valores[meio]) { //O valor � maior que o est� no meio
					inicio = meio + 1;
				}else { //O valor � menor do que o que est� no meio
					fim = meio - 1;
				}
			}
		}
		return -1;
	}
	
	public int buscaBianriaDecrescente(int numero) {
		int meio, inicio, fim;
		int iteracoes = 0;
		inicio = 0;
		fim = numeros.length - 1;
		while(inicio <= fim) {
			iteracoes++;
			meio = (inicio + fim) / 2;
			if(numero == numeros[meio]) {
				return meio;
			}
			else {
				if(numero > numeros[meio]) {
					fim = meio - 1;
				}else if(numero < numeros[meio]){ //didatico n�o precisava ter if
					inicio = meio + 1;
				}
			}
		}
		return -1;
	}
}
