package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Scanner;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pilha<Integer> binario = new Pilha<Integer>();
		
		int decimal = teclado.nextInt();
		
		try {
			converteParaBinario(decimal, binario);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void converteParaBinario(int decimal, Pilha<Integer> binario) {
		if(!(decimal > 0)) {
			throw new IllegalArgumentException("Número inválido!!");
		}
		int divisao = decimal;
		while(divisao != 0){
			binario.empilha(divisao % 2);
			divisao = divisao / 2;
		}
		exibe(binario);
	}
	
	private static void exibe(Pilha<Integer> binario) {
		for(int i = binario.tamanho(); i > 0 ; i--) {
			System.out.print(binario.desempilha());
		}
	}
}
