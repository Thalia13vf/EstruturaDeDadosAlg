package com.estruturadedadosalg.listasligadas;

public class Celula {
	
	private Celula anterior;
	private Celula proxima;
	private Object elemento;
	
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	public Celula(Object elemento2) {
		this.elemento = elemento2;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	
}
