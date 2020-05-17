package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a express�o: ");
		String exp = teclado.nextLine();
		
		String metade = exp.substring(0, exp.length() / 2);
		String outra = exp.substring(metade.length());
		
		int contadorEsquerda = 0;
		int contadorDireita = 0;
		
		for(int i = 0; i < metade.length(); i++) {
			if(metade.charAt(i) == '(' || metade.charAt(i) == ')') {
				contadorEsquerda++;
			}
		}
		for(int i = 0; i < outra.length(); i++) {
			if(outra.charAt(i) == '(' || outra.charAt(i) == ')') {
				contadorDireita++;
			}
		}
		
		if(contadorEsquerda == contadorDireita) {
			System.out.println("Express�o est� certa");
		}
		else {
			System.out.println("Express�o viola a condi��o 1");
		}
	}
}
