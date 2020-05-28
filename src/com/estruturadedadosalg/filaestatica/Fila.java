package com.estruturadedadosalg.filaestatica;

import com.estruturadedadosalg.baseestatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if(estaVazia()) {
			return null;
		}
		return elementos[0];
	}
	
	public T desenfileira() {
		final int POSICAO = 0;
		
		T primeiroElemento = this.espiar();
		this.remove(POSICAO);
		
		return primeiroElemento;
	}
	
}
