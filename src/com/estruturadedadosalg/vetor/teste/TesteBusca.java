package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteBusca {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(3));
	}
}
