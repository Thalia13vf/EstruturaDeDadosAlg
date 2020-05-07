package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteLimpar {
	public static void main(String[] args) {
		Vetor<Integer> vetor = new Vetor<Integer>(4);
		vetor.adiciona(3);
		vetor.adiciona(6);
		vetor.adiciona(4);
		vetor.adiciona(22);
		
		System.out.println(vetor);
		
		vetor.limpar();
		
		System.out.println(vetor);
	}
}
