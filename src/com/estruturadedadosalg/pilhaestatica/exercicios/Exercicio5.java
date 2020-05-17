package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Scanner;


public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o texto: ");
		String texto = teclado.nextLine();
		
		if(isPalindromo(texto)) {
			System.out.println("� um pal�ndromo!!!!");
		}else {
			System.out.println("N�o � um pal�ndromo");
		}
	}
	
	public static boolean isPalindromo(String texto) {
		texto = texto.toLowerCase();
		texto = texto.replace(" ", "");
		texto = texto.replace(".", "");
		
		char[] caracteres = texto.toCharArray();
		
		for(int i = 0; i < (caracteres.length / 2); i++) {
			if(!(caracteres[i] == caracteres[caracteres.length - i - 1])) {
				return false;
			}			
		}	
		return true;
	}

}
