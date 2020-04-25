package com.estruturadedadosalg.vetor;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			throw new Exception("A lista j� est� cheia! N�o � poss�vel adicionar mais elementos.");
		}
	}*/
	
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		return this.elementos[posicao];
	}
	
	//Busca o elemento, se existir retorna a posi��o, se n�o -1
	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		
		return s.toString();
	}
	
}
