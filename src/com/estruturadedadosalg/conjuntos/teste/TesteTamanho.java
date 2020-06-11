package com.estruturadedadosalg.conjuntos.teste;

import java.util.List;

import com.estruturadedadosalg.conjuntos.ConjuntoEspalhamento;

public class TesteTamanho {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		for(int i = 0; i < 1050; i++) {
			conjunto.adiciona("" + i);
		}
			
		conjunto.adiciona("Fernanda");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Bia");
		
		System.out.println(conjunto.tamanho());
		
		List<String> lista = conjunto.pegaTodas();
		
		System.out.println(lista);
	}
}
