package com.estruturadedadosalg.filaestatica.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		fila.add(1);
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println("Espiar primeira posição: " + fila.peek());
		
		System.out.println("Remove "+fila.remove());
		
		System.out.println(fila);
		
	}
}
