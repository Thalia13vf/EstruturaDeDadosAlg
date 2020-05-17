package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Scanner;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Exercicio5Palindromo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		
		imprimeResultado("ADA");
		imprimeResultado("ABCD");
		imprimeResultado("ABCCBA");
		imprimeResultado("Maria");
	}
	
	public static void imprimeResultado(String texto) {
		System.out.println(texto + " é palindromo " + testaPalindromo(texto));
	}
	
	public static boolean testaPalindromo(String texto) {
		Pilha<Character> pilha = new Pilha<>();
		
		for(int i = 0; i < texto.length(); i++) {
			pilha.empilha(texto.charAt(i));
		}
		
		String palavraInvertida = "";
		
		while(!pilha.estaVazia()) {
			palavraInvertida += pilha.desempilha();
		}
		
		if(texto.equalsIgnoreCase(palavraInvertida)) {
			return true;
		}
		return false;
	}
}
