package com.estruturadedadosalg.listasligadas.testes;

import com.estruturadedadosalg.listasligadas.ListaLigada;

public class TesteRemoveDoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoComeco();
		
		System.out.println(lista);
		
	}
}
