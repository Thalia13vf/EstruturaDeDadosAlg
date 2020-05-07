package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteUltimoIndice {
	public static void main(String[] args) {
		Vetor<String> vetor = new Vetor<String>(5);
		vetor.adiciona("teste");
		vetor.adiciona("teste2");
		vetor.adiciona("teste3");
		vetor.adiciona("teste3");
		
		System.out.println("Ultimo indice " + vetor.ultimoIndice("teste"));
	}
}
