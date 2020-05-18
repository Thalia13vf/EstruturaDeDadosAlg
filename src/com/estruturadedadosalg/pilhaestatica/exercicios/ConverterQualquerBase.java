package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Stack;

//Correção do exercicio
public class ConverterQualquerBase {
	public static void main(String[] args) {
		imprimeResultadoQualquerBase(20, 16);
	}
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base + 
				" é: " + decimalQualquerBase(numero, base));
	}
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binário é: " + decimalBinario(numero));
	}
	
	public static String decimalBinario(int numero) {
		Stack<Integer> stack = new Stack<>();
		String numeroBinario = "";
		int resto;
		
		while(numero > 0) {
			resto = numero % 2;
			stack.push(resto);
			numero /= 2;
		}
		
		
		while(!stack.isEmpty()) {
			numeroBinario += stack.pop();
		}
		
		return numeroBinario;
	}
	
	public static String decimalQualquerBase(int numero, int base) {
		if(base > 16) {
			throw new IllegalArgumentException("Base inválida! Somente até a base 16");
		}
		
		Stack<Integer> stack = new Stack<>();
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		while(numero > 0) {
			resto = numero % base;
			stack.push(resto);
			numero /= base;
		}
		
		while(!stack.isEmpty()) {
			numeroBase += bases.charAt(stack.pop());  
		}
		
		return numeroBase;
	}
}

