package com.estruturadedadosalg.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class DiamantesEAreia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int casosDeTeste = teclado.nextInt();

		for(int c = 0; c < casosDeTeste; c++) {
			int numeroDeDiamantes = 0;
			Stack<Character> pilha = new Stack<>();
			Stack<Character> auxiliar = new Stack<>();
			String diamantes = teclado.next();

			for(int i = 0; i < diamantes.length(); i++) {
				if(diamantes.charAt(i)== '<') {
					pilha.add(diamantes.charAt(i));
				}else if(diamantes.charAt(i) == '>'){
					auxiliar.add(diamantes.charAt(i));
				}
			}
			
			int menor = 0;
			if(pilha.size() < auxiliar.size()) {
				menor = pilha.size();
			}else {
				menor = auxiliar.size();
			}
			
			for(int i = 0; i < menor; i++) {
				if(pilha.pop() == '<' && auxiliar.pop() == '>') {
					numeroDeDiamantes++;
				}	
			}
			System.out.println(numeroDeDiamantes);
		}
		teclado.close();
	}
}
