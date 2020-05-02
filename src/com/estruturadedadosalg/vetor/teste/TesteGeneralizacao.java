package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteGeneralizacao {

	public static void main(String[] args) {
		Contato c1 = new Contato("Contato1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("Contato2", "2345-8877", "con2@gmail.com");
		Contato c3 = new Contato("Contato3", "2356-6633", "cnt3@gmail.com");
		
		Contato c4 = new Contato("Contato1", "1234-5678", "contato1@gmail.com");
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor " + pos);
		}
		else {
			System.out.println("O vetor não existe no vetor");
		}
		System.out.println(vetor);
	}

}
