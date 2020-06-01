package com.estruturadedadosalg.pilha.teste;

import com.estruturadedadosalg.pilha.Peca;
import com.estruturadedadosalg.pilha.Pilha;

public class Teste {
	public static void main(String[] args) {
		Pilha<Peca> pilha = new Pilha<>();
		
		Peca peca = new Peca();
		peca.setNome("lampada");
		pilha.insere(peca);
		
		System.out.println(pilha);
		
		Peca pecaRemove = pilha.remove();
		
		if(pilha.vazia()) {
			System.out.println("A pilha está vazia.");
		}
		
		Pilha<String> pilha2 = new Pilha<>();
		pilha2.insere("Adalberto");
		pilha2.insere("Maria");
		
		System.out.println(pilha2);
		
		String maria = pilha2.remove();
		String adalberto = pilha2.remove();
		
		System.out.println(maria);
		System.out.println(adalberto);
			
		
	}
}
