package com.estruturadedadosalg.busca;

public class Colecao {
	//private int valores[] = {12, 56, 87, 23, 96, 43, 27, 76, 33, 11};
	private int valores[] = {11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };
	
	public int buscaSequencial(int valor) {
		int iteracoes = 0;
		int posicao;
		for(posicao = 0; posicao < valores.length; posicao++) {
			if(valor == valores[posicao]) {
				System.out.println("Iterações " + iteracoes);
				return posicao;
			}
			iteracoes++;
		}
		System.out.println("Iterações " + iteracoes);
		return -1;
	}
	
	public int buscaBinaria(int valor) {
		int meio, inicio, fim;
		inicio = 0; //primeira posição
		fim = valores.length - 1; //última posição
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			if(valor == valores[meio]) { // o valor é igual ao que está no meio
				return meio;
			}else {
				if(valor > valores[meio]) { //O valor é maior que o está no meio
					inicio = meio + 1;
				}else { //O valor é menor do que o que está no meio
					fim = meio - 1;
				}
			}
		}
		return -1;
	}
}
