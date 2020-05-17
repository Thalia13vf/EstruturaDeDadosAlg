package com.estruturadedadosalg.pilhaestatica.exercicios;
import java.util.Scanner;

import com.estruturadedadosalg.pilhaestatica.Pilha;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Pilha<Integer> par = new Pilha<>();
		Pilha<Integer> impar = new Pilha<>();

		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " número: ");
			int num = teclado.nextInt();
			empilhaNumero(num, par, impar);
		}
		System.out.println("----------------------");
		System.out.println("Pares: ");
		desempilhaTodas(par);
		
		System.out.println("----------------------");
		System.out.println("Impares: ");
		desempilhaTodas(impar);

	}

	private static void empilhaNumero(int num, Pilha<Integer> par, Pilha<Integer> impar) {
		if(num == 0) {
			try {
				desempilha(par, impar);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else if(num % 2 == 0) {
			par.empilha(num);
		}
		else {
			impar.empilha(num);
		}

	}
	
	private static void desempilha(Pilha<Integer> par, Pilha<Integer> impar) throws Exception {
		if(par.estaVazia() || impar.estaVazia()) {
			throw new Exception("A pilha está vazia!");
		}
		
		par.desempilha();
		impar.desempilha();
	}
	
	private static void desempilhaTodas(Pilha<Integer> pilha) {
		for(int i = pilha.tamanho(); i > 0; i--) {
			System.out.println(pilha.desempilha());
		}
	}

}
