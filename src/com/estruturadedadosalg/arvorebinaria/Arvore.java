package com.estruturadedadosalg.arvorebinaria;

public class Arvore {
	private Elemento elemento;
	private Arvore direita;
	private Arvore esquerda;
	
	public Arvore() { //arvore vazia
		this.elemento = null;
		this.direita = null;
		this.esquerda = null;
	}
	
	public Arvore(Elemento elemento) { //arvore com um elemento
		this.elemento = elemento;
		this.direita = null;
		this.esquerda = null;
		//System.out.println("�rvore criada com o elemento " + elemento.getValor());
	}
	
	//M�todos de controle
	public boolean isEmpty() {
		return (this.elemento == null);
	}
	
	public void inserir(Elemento novo) {
		if(isEmpty()) {
			this.elemento = novo;
		}
		else {
			Arvore novaArvore = new Arvore(novo);
			//inserir na descendencia esquerda
			if(novo.getValor() < this.elemento.getValor()) { 
				if(this.esquerda == null) { //n� folha?
					this.esquerda = novaArvore;
					//System.out.println("Elemento " + novo.getValor() + " inserido � esquerda de " + this.elemento.getValor());
				}
				else { //j� tem uma descencia h� esquerda
					this.esquerda.inserir(novo); //repassou a responsabilidade para a sub-arvore esquerda
				}
			}
			//inserir na direita
			else if(novo.getValor() > this.elemento.getValor()) {
				if(this.direita == null) {
					this.direita = novaArvore;
					//System.out.println("Elemento " + novo.getValor() + " inserido � direita de " + this.elemento.getValor());
				}else {
					this.direita.inserir(novo);
				}
			}
		}
	}
	
	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Arvore getDireita() {
		return direita;
	}

	public void setDireita(Arvore direita) {
		this.direita = direita;
	}

	public Arvore getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Arvore esquerda) {
		this.esquerda = esquerda;
	}
	
}
