package com.estruturadedadosalg.filaestatica.exercicio;

public class Documento implements Comparable<Documento>{
	private String nome;
	private int quantidadePaginas;
	
	public Documento() {}
	
	public Documento(String nome, int quantidadePaginas) {
		super();
		this.nome = nome;
		this.quantidadePaginas = quantidadePaginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	@Override
	public String toString() {
		return "Documento [nome=" + nome + ", quantidadePaginas=" + quantidadePaginas + "]";
	}
	
	@Override
	public int compareTo(Documento o) {
		if(this.quantidadePaginas > o.getQuantidadePaginas()) {
			return 1;
		}else if(this.quantidadePaginas < o.getQuantidadePaginas()) {
			return -1;
		}
		return 0;
	}
	
	
}
