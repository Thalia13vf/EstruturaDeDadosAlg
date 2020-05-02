package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteGeneralizacaoObject {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);
		
		vetor.adiciona(1);
		vetor.adiciona("String");
		
		System.out.println(vetor);
	}
}
