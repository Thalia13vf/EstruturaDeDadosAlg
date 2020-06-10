package com.estruturadedadosalg.mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista<C, V> {
	private List<Associacao<C, V>> associacoes = new ArrayList<>();
	
	public void adiciona(C chave, V valor) {
		if(!this.contemChave(chave)) {
			Associacao<C, V> associacao = new Associacao<>(chave, valor);
			this.associacoes.add(associacao);		
		}
	}
	
	public V pega(C chave) {
		for(Associacao<C, V> associacao : this.associacoes) {
			if(chave.equals(associacao.getChave())) {
				return associacao.getValor();
			}
		}
		throw new IllegalArgumentException("A chave não existe.");
	}
	
	public void remove(C chave) {
		if(this.contemChave(chave)) {
			for(int i = 0; i < this.associacoes.size(); i++) {
				Associacao<C, V> associacao = this.associacoes.get(i);
				
				if(chave.equals(associacao.getChave())) {
					this.associacoes.remove(i);
					break;
				}
			}
		}else {
			throw new IllegalArgumentException("A chave não existe.");
		}
	}
	
	public boolean contemChave(C chave) {
		for(Associacao<C, V> associacao : this.associacoes) {
			if(chave.equals(associacao.getChave())) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.associacoes.size();
	}
}
