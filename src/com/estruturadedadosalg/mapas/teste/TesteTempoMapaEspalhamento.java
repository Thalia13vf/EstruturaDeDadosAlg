package com.estruturadedadosalg.mapas.teste;

import com.estruturadedadosalg.mapas.Carro;
import com.estruturadedadosalg.mapas.MapaEspalhamento;

public class TesteTempoMapaEspalhamento {
	public static void main(String[] args) {
		MapaEspalhamento<String, Carro> mapaEspalhamento = 
				new MapaEspalhamento<>();
		int numeroDeElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.adiciona("" + i, new Carro("c" + i));
		}
		
		System.out.println("Tamanho " + mapaEspalhamento.tamanho());
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.pega("" + i);
		}
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.contemChave("" + i);
		}
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.remove("" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		//Sem a tabela din�mica 1.161
		//Com a tabela din�mica 0.414
		
	}
}
