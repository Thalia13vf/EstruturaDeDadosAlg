package com.estruturadedadosalg.mapas.teste;

import com.estruturadedadosalg.mapas.Carro;
import com.estruturadedadosalg.mapas.MapaEspalhamento;

public class TesteAdicionaMapaEspalhamento {
	public static void main(String[] args) {
		MapaEspalhamento<String, Carro> mapa = new MapaEspalhamento<>();
		
		System.out.println(mapa.tamanho());
		
		for(int i = 0; i < 15050; i++) {
			mapa.adiciona("*" + i, new Carro("*" + i));
		}
		
		System.out.println("Tamanho " + mapa.tamanho());
	}
	
}
