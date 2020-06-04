package com.estruturadedadosalg.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class DiamantesEAreia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Stack<Character> pilha = new Stack<>();

		int casosDeTeste = teclado.nextInt();

		for(int i = 0; i < casosDeTeste; i++) {
			String diamantes = teclado.next();
			System.out.println(contar(diamantes));
		}

	}

	public static int contar(String diamantes) {
		Stack<Character> pilha = new Stack<>();
		StringBuilder diamantesSemAreia = new StringBuilder();
		diamantesSemAreia.append(diamantes);
		diamantesSemAreia = diamantesSemAreia.reverse();
		
		int total = 0;
		for(int i = 0; i < diamantes.length(); i++) {
			if(diamantes.charAt(i) != '.') {
				pilha.add(diamantes.charAt(i));
			}
		}

		System.out.println(pilha); 
		for(int i = 0; i < pilha.size(); i++) {	
			char topo = pilha.pop();
			if(topo == '<') {
				char proximo = pilha.pop();
				if(proximo == '>') {
					total++;
					
					System.out.println("Diamante encontrado");
					System.out.println(pilha);
				}
			}
		}	
		return total;
	}

}
