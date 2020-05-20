package com.estruturadedadosalg.filaestatica.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {
	public static void main(String[] args) {
		
		Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		Queue<Paciente> fila = new PriorityQueue<Paciente>();
		Queue<Paciente2> fila2 = new PriorityQueue<>
		(new Comparator<Paciente2>() {

			@Override
			public int compare(Paciente2 p1, Paciente2 p2) {
			
				return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
			}
		});
		
		filaComPrioridade.add(2);
		filaComPrioridade.add(1);
		filaComPrioridade.add(3);
		filaComPrioridade.add(2);
		
		fila.add(new Paciente("A", 2));
		fila.add(new Paciente("B", 1));
		fila.add(new Paciente("C", 3));
		
		
		fila2.add(new Paciente2("Mo", 2));
		fila2.add(new Paciente2("Maria", 1));
		fila2.add(new Paciente2("Ana", 3));
		
		System.out.println(fila);
		System.out.println(filaComPrioridade);
		System.out.println(fila2);
		
	}
}
