package com.estruturadedadosalg.pilhaestatica.exercicios;

public class Livro {
	private String isbn; 
	private String titulo;
	private String autor;
	private int anoLancamento;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, int anoLancamento) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoLancamento = anoLancamento;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoLancamento=" + anoLancamento + "]";
	}
	
	
}
