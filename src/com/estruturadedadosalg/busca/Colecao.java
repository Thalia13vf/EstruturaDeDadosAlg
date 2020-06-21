package com.estruturadedadosalg.busca;

public class Colecao {
	//private int valores[] = {12, 56, 87, 23, 96, 43, 27, 76, 33, 11};
	private int valores[] = {11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };
	
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
}
