package com.estruturadedadosalg.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
	private List<T> pecas = new LinkedList<>();
	
	public void insere(T o) {
		this.pecas.add(o);
	}
	
	public T remove() {
		return this.pecas.remove(this.pecas.size() - 1);
	}
	
	public boolean vazia() {
		return this.pecas.size() == 0;
	}
	
	public int tamanho() {
		return this.pecas.size();
	}
	
	public T topo() {
		return this.pecas.get(this.pecas.size() - 1);
	}
	
	public String toString() {
		if(this.pecas.size() == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		
		for(int i = 0; i < this.pecas.size() - 1;i++) {
			builder.append(this.pecas.get(i));
			builder.append(", ");
		}
		
		builder.append(this.pecas.get(this.pecas.size() - 1));
		builder.append("]");
		
		return builder.toString();
	}
}
