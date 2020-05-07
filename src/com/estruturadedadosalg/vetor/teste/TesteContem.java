package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteContem {
	public static void main(String[] args) {
		Vetor<String> vetor = new Vetor<String>(2);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		
		System.out.println(vetor);
		System.out.println("Contém " + vetor.contem("U"));
		System.out.println("Contém " + vetor.contem("A"));
	}
}
