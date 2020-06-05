package com.estruturadedadosalg.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {
	private List<T> alunos = new LinkedList<>();
	
	public void insere(T a) {
		this.alunos.add(a);
	}
	
	public T remove() {
		return this.alunos.remove(0);
	}
	
	public boolean vazia() {
		return this.alunos.size() == 0;
	}
}
