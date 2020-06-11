package com.estruturadedadosalg.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento<T> {
	private int tamanho = 0;
	
	private List<List<T>> tabela = new 
			ArrayList<List<T>>();
	
	public ConjuntoEspalhamento() {
		for(int i = 0; i < 26; i++) {
			LinkedList<T> lista = new LinkedList<>();
			tabela.add(lista);
		}
	}
	
	private int calculaIndiceDaTabela(T o) {
		int codigoDeEspalhamento = o.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}//Função de espalhamento
	
	private void redimensionaTabela(int novaCapacidade) {
		List<T> objetos = this.pegaTodas();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<T>());
		}
		
		for(T objeto : objetos) {
			this.adiciona(objeto);
		}
		
		this.tamanho = objetos.size();
	}
	
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if(carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		}else if(carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	public void adiciona (T o) {
		if(!this.contem(o)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(o);
			List<T> lista = this.tabela.get(indice);
			lista.add(o);
			this.tamanho++;
		}
	}
	
	public void remove (T o) {
		if(this.contem(o)) {
			int indice = this.calculaIndiceDaTabela(o);
			List<T> lista = this.tabela.get(indice);
			lista.remove(o);
			this.tamanho--;
			this.verificaCarga();
		}
	}
	
	public boolean contem (T o) {
		int indice = this.calculaIndiceDaTabela(o);
		List<T> lista = this.tabela.get(indice);
		
		return lista.contains(o);
	}
	
	public List<T> pegaTodas(){
		List<T> palavras = new ArrayList<>();
		
		for(int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void imprimeTabela() {
		for(List<T> lista : this.tabela) {
			System.out.print("[");
			for(int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
}
