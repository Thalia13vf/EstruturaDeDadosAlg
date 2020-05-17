package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Scanner;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " ° número: ");
			int num = teclado.nextInt();
			
			verificarNumero(num, pilha);
		}
		
		if(!pilha.estaVazia()) {
			desempilhaTodos(pilha);
		}
	}
	
	public static void verificarNumero(int num, Pilha<Integer> pilha) {
		if(num % 2 == 0) {
			pilha.empilha(num);
			System.out.println("Número par, empilhando o número " + num);
		}
		else {
			if(!pilha.estaVazia()){
				System.out.println("Número ímpar, desempilhando o número "
			+ pilha.desempilha());
				
			}	
			else {
				System.out.println("A pilha está vazia!");
			}
		}
			
	}
	
	private static void desempilhaTodos(Pilha<Integer> pilha) {
		System.out.println();
		for(int i = pilha.tamanho(); i > 0; i--) {
			System.out.println("Final, desempilhando todos os elementos " + pilha.desempilha());
			
		}
	}
}
