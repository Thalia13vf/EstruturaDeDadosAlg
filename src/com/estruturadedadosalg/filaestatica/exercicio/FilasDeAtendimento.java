package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.Fila;
import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class FilasDeAtendimento {
	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		FilaComPrioridade<String> prioridade = new FilaComPrioridade<String>();
		
		fila.enfileira("pac1");
		fila.enfileira("pac2");
		fila.enfileira("pac3");
		fila.enfileira("pac4");
		fila.enfileira("pac5");
		
		prioridade.enfileira("pacPrioridade1");
		prioridade.enfileira("pacPrioridade2");
		prioridade.enfileira("pacPrioridade3");
		prioridade.enfileira("pacPrioridade4");
		prioridade.enfileira("pacPrioridade5");
		prioridade.enfileira("pacPrioridade6");
		prioridade.enfileira("pacPrioridade7");
		
		int contador = 0;
		
		while(!prioridade.estaVazia()) {
			if(contador < 3) {
				System.out.println(prioridade.desenfileira() + " foi atendida");
				contador++;
			}else if(contador == 3) {
				System.out.println(fila.desenfileira() + " foi atendida");
				contador = 0;
			}
		}
		
		while(!fila.estaVazia()) {
			System.out.println(fila.desenfileira() + " foi atendida");
		}
		
	}
}
