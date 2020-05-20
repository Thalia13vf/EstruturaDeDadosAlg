package com.estruturadedadosalg.filaestatica.teste;

import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class TesteFilaComPrioridade {
	public static void main(String[] args) {
		FilaComPrioridade<Paciente> fila = 
				new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A",2)); 
		fila.enfileira(new Paciente("B", 1));
		fila.enfileira(new Paciente("C", 3));
		fila.enfileira(new Paciente("D", 4));
		fila.enfileira(new Paciente("E", 2));

		System.out.println(fila);
		System.out.println("Desenfileirando....");
		
		System.out.println("Tamanho " + fila.tamanho());
		
		for(int i = fila.tamanho(); i > 0; i--) {
			System.out.println(fila.desenfileira());
		}
		
		
		
	}
}
