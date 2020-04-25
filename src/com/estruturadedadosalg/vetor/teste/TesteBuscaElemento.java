package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteBuscaElemento {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		
		System.out.println(vetor.busca("elemento 2"));//posição ou -1
		System.out.println(vetor.busca(1)); //elemento ou erro
		
	}
}
