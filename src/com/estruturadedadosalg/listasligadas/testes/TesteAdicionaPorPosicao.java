package com.estruturadedadosalg.listasligadas.testes;

import com.estruturadedadosalg.listasligadas.ListaLigada;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona(0, "Paulo");
		lista.adiciona(1, "Camila");
		lista.adiciona(2, "Ana");
		
		System.out.println(lista);
	}
}
