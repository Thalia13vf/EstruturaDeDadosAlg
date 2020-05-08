package com.estruturadedadosalg.vetor;

import com.estruturadedadosalg.base.EstruturaEstatica;

public class Vetor2<T> extends EstruturaEstatica<T> {
	
	public Vetor2() {
		super();
	}
	
	public Vetor2(int capacidade) {
		super(capacidade);
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}
	
	
}
