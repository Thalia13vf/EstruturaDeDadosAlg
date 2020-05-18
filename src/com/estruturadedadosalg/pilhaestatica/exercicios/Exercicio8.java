package com.estruturadedadosalg.pilhaestatica.exercicios;

import java.util.Stack;

public class Exercicio8 {
	public static void main(String[] args) {
		Stack<Integer> original = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();
		
		original.push(3);
		original.push(2);
		original.push(1);
		
		System.out.println("--------------------");
		System.out.println("Original: " + original);
		System.out.println("Destino: " + destino);
		System.out.println("Auxiliar: " + auxiliar);
		
		
		torreDeHanoi(original.size(), original, destino, auxiliar);
	
	}
	
	public static void torreDeHanoi(int numeroDeDiscos, Stack<Integer> original, 
			Stack<Integer> destino, Stack<Integer> auxiliar) {
		
		if(numeroDeDiscos > 0) { 
			//ponto de parada do alg recursivo
			torreDeHanoi(numeroDeDiscos - 1, original, auxiliar, destino);
			destino.push(original.pop());
			
			System.out.println("--------------------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + auxiliar);
			
			torreDeHanoi(numeroDeDiscos - 1, auxiliar, destino, original);
		}
			
			
			
	}
}
