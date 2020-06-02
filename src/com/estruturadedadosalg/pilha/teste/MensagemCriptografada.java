package com.estruturadedadosalg.pilha.teste;

import com.estruturadedadosalg.pilha.Pilha;

public class MensagemCriptografada {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("Uma mensagem confidencial");
		
		Pilha<Character> pilha = new Pilha<>();
		Pilha<Character> codificada = new Pilha<>();
		
		System.out.println(s);
		
		for(int i = 0; i < s.length() ; i++) {
			pilha.insere(s.charAt(i));
			if(Character.isWhitespace(pilha.topo())) {
				System.out.println("vazio");
				for(int c = pilha.tamanho(); c > 0; c--) {
					codificada.insere(pilha.remove());
					System.out.println(codificada);
				}
				
		}
	}
		
		
		System.out.println("Final: " + codificada);
		System.out.println(pilha);
	}
}
