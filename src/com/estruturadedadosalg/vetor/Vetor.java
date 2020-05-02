package com.estruturadedadosalg.vetor;

import java.lang.reflect.Array;

public class Vetor<T> {
	//T de Type, ou seja é passado o tipo 
	private T[] elementos;
	private int tamanho;
	
	//Melhor solução para instanciar arrays de tipo generico
	public Vetor(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	//Utilizando Reflection API
	public Vetor(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
			//o novo vetor com o dobro do tamanho é atribudo ao antigo
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}
	
	//Busca o elemento, se existir retorna a posição, se não -1
	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
	public void remove(T elemento) {
		int posicao = this.busca(elemento);
		if(posicao >= 0) {
			this.remove(posicao);
		}
		else {
			throw new IllegalArgumentException("Esse elemento não existe no vetor.");
		}
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
