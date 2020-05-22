package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.Fila;
import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class FilasDeAtendimentoCorrecao {
	public static void main(String[] args) {
		Fila<String> regular = new Fila<String>();
		FilaComPrioridade<String> prioridade = new FilaComPrioridade<>();
		
		final int MAX_PRIORIDADE = 3;
		
		regular.enfileira("Pessoa1");
		regular.enfileira("Pessoa2");
		regular.enfileira("Pessoa3");
		
		prioridade.enfileira("Pessoa 1P");
		prioridade.enfileira("Pessoa 2P");
		prioridade.enfileira("Pessoa 3P");
		prioridade.enfileira("Pessoa 4P");
		prioridade.enfileira("Pessoa 5P");
		prioridade.enfileira("Pessoa 6P");
		
		regular.enfileira("Pessoa4");
		regular.enfileira("Pessoa5");
		regular.enfileira("Pessoa6");
		regular.enfileira("Pessoa7");
		regular.enfileira("Pessoa8");
		
		while(!regular.estaVazia() || !prioridade.estaVazia()) {
			
			int contador = 0;
			
			while(!prioridade.estaVazia() && contador < MAX_PRIORIDADE) {
				atendePessoa(prioridade);
				contador++;
			}
			
			if(!regular.estaVazia()) {
				atendePessoa(regular); 
			}
			
			if(prioridade.estaVazia()) {
				while(!regular.estaVazia()) {
					atendePessoa(regular);
				}
			}
		}
		
		
	}
	
	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " foi atendida.");
			
	}
}
