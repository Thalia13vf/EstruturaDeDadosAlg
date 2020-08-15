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
		//System.out.println("Árvore criada com o elemento " + elemento.getValor());
	}
	
	//Métodos de controle
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
				if(this.esquerda == null) { //nó folha?
					this.esquerda = novaArvore;
					//System.out.println("Elemento " + novo.getValor() + " inserido á esquerda de " + this.elemento.getValor());
				}
				else { //já tem uma descencia há esquerda
					this.esquerda.inserir(novo); //repassou a responsabilidade para a sub-arvore esquerda
				}
			}
			//inserir na direita
			else if(novo.getValor() > this.elemento.getValor()) {
				if(this.direita == null) {
					this.direita = novaArvore;
					//System.out.println("Elemento " + novo.getValor() + " inserido á direita de " + this.elemento.getValor());
				}else {
					this.direita.inserir(novo);
				}
			}
		}
	}
	
	public boolean busca(int valor) {
		if(isEmpty()) {
			return false;
		}
		if(this.elemento.getValor() == valor) { //se é o elemento raiz
			return true;
		}else {
			if(valor < this.elemento.getValor()) {
				if(this.esquerda == null) {
					return false;
				}
				else {
					return this.esquerda.busca(valor);
				}
			}
			else if(valor > this.elemento.getValor()) {
				if(this.direita == null) {
					return false;
				}
				else {
					return this.direita.busca(valor);
				}
			}
			return false;
		}
	}
	
	public void imprimirPreOrdem() {
		if(!isEmpty()) {
			System.out.print(this.elemento.getValor() + " ");
			if(this.esquerda != null) {
				this.esquerda.imprimirPreOrdem();
			}
			if(this.direita != null) {
				this.direita.imprimirPreOrdem();
			}
		}
	}
	
	public void imprimirInOrdem() {
		if(!isEmpty()) {
			if(this.esquerda != null) {
				this.esquerda.imprimirInOrdem();
			}
			System.out.print(this.getElemento().getValor() + " ");
			if(this.direita != null) {
				this.direita.imprimirInOrdem();
			}		
		}
	}
	
	public void imprimirInOrdemInvertida() {
		if(!isEmpty()) {
			if(this.direita != null) {
				this.direita.imprimirInOrdemInvertida();
			}
			System.out.print(this.elemento.getValor() + " ");
			if(this.esquerda != null) {
				this.esquerda.imprimirInOrdemInvertida();
			}
		}
	}
	
	public void imprimirPosOrdem() {
		if(!isEmpty()) {
			if(this.direita != null) {
				this.direita.imprimirPosOrdem();
			}
			if(this.esquerda != null) {
				this.esquerda.imprimirPosOrdem();
			}
			System.out.print(this.elemento.getValor() + " ");
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
