package com.estruturadedadosalg.pilha.exercicios;

public class Email {
	private String destinatario;
	private String autor;
	private String titulo;
	private String mensagem;
	
	public Email(String destinatario, String autor, String titulo, 
			String mensagem) {
		this.destinatario = destinatario;
		this.autor = autor;
		this.titulo = titulo;
		this.mensagem = mensagem;
	}
	
	public void enviar() {
		System.out.println("Email de " + this.autor + " enviado para " + this.destinatario);
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
