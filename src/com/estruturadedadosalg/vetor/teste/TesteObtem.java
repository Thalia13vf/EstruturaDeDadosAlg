package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteObtem {
	public static void main(String[] args) {
		Vetor<String> vetor = new Vetor<String>(3);
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");

		System.out.println(vetor.obtem(0));
		System.out.println(vetor.obtem(2));
		System.out.println(vetor.obtem(4));
		

	}
}
