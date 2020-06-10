package com.estruturadedadosalg.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento<C, V> {
	private List<List<Associacao<C, V>>> tabela = 
			new ArrayList<List<Associacao<C, V>>>();
	private int tamanho = 0;

	public MapaEspalhamento() {
		for(int i = 0; i < 50; i++) {
			this.tabela.add(new LinkedList<Associacao<C, V>>());
		}
	}

	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}

	private void verificarCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;

		if(carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
			
		}else if(carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}

	private void redimensionaTabela(int novaCapacidade) {
		List<Associacao<C, V>> todas = this.pegaTodas();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<Associacao<C, V>>());
		}
		
		for(Associacao<C, V> a : todas) {
			this.adiciona(a.getChave(), a.getValor());
		}
	}

	private List<Associacao<C, V>> pegaTodas() {
		List<Associacao<C, V>> todas = new ArrayList<>(); 
		for(int i = 0; i < this.tabela.size(); i++) {
			todas.addAll(this.tabela.get(i));
		}
		return todas;
	}

	public boolean contemChave(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);
		for(int i = 0; i < lista.size(); i++) {
			Associacao<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				return true;
			}
		}

		return false;
	}

	public void remove(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);

		for(int i = 0; i < lista.size(); i++) {
			Associacao<C, V> associacao = lista.get(i);

			if(associacao.getChave().equals(chave)) {
				lista.remove(i);
				this.tamanho--;
				this.verificarCarga();
				return;
			}
		}
		
		throw new IllegalArgumentException("A chave não existe.");
	}

	public void adiciona(C chave, V valor) {
		this.verificarCarga();
		if(this.contemChave(chave)) {
			this.remove(chave);
		}
		
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);
		lista.add(new Associacao<C, V>(chave, valor));
		this.tamanho++;
	}

	public V pega(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);

		for(int i = 0; i < lista.size(); i++) {
			Associacao<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}

		throw new IllegalArgumentException("A chave não existe");
	}

	public int tamanho() {
//		this.tamanho = 0;
//		for(int i = 0; i < this.tabela.size(); i++) {
//			this.tamanho += this.tabela.get(i).size();
//		}
		return this.tamanho;
	}
	
}
