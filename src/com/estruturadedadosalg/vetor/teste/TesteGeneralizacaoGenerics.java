package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteGeneralizacaoGenerics {
	public static void main(String[] args) {
		Vetor<String> vetor = new Vetor<String>(2);
		Vetor<Contato> contatos = new Vetor<Contato>(2);
		Vetor<Integer> inteiros = new Vetor<Integer>(2);

		vetor.adiciona("Teste1");
		vetor.adiciona("Teste2");
		System.out.println(vetor);
		
		contatos.adiciona(new Contato("teste", "1242-2312","teste"));
		contatos.adiciona(new Contato("teste2", "3457-0835","teste2"));
		System.out.println(contatos);
		
		inteiros.adiciona(1);
		inteiros.adiciona(0, 67);
		System.out.println(inteiros);
		
	}
}
