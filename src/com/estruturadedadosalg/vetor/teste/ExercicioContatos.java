package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class ExercicioContatos {
	public static void main(String[] args) {
		Vetor<Contato> contatos = new Vetor<Contato>(20);
		
		for(int i = 0; i <= 30; i++) {
			Contato c = new Contato();
			c.setNome("c" + i);
			contatos.adiciona(c);
		}
		System.out.println(contatos);
		
		Contato c = new Contato("contato0", "","");
		contatos.adiciona(0, c);
		
		System.out.println(contatos);
		
		System.out.println("Busca por elemento " + contatos.busca(c));
		
		System.out.println("Busca por posição " + contatos.busca(0));
		
		System.out.println("Contém elemento: " + contatos.contem(c));
		
		System.out.println("Obtém elemento da posição " + contatos.obtem(0));
	
		System.out.println("Tamanho " + contatos.tamanho());
		
		contatos.adiciona(c);
		System.out.println("último indice do elemento no vetor " + contatos.ultimoIndice(c));
		
		System.out.println("Tamanho atual " + contatos.tamanho());
		contatos.remove(2);
		contatos.remove(c);
		System.out.println("Tamanho depois de remover " + contatos.tamanho());

		contatos.limpar();
		System.out.println("Tamanho apos limpar " + contatos.tamanho());
		System.out.println(contatos);
	}
}
