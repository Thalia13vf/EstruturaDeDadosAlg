package com.estruturadedadosalg.vetor.teste;

import com.estruturadedadosalg.vetor.Vetor;

public class TesteRemove {
	public static void main(String[] args) {
		Vetor<String> vetor = new Vetor<String>(3);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Removendo o elemento");
		
		try{
			vetor.remove("F");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(vetor);
	}
}
