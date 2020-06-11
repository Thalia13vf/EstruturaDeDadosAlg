package com.estruturadedadosalg.mapas.teste;

import com.estruturadedadosalg.mapas.Carro;
import com.estruturadedadosalg.mapas.MapaEspalhamento;

public class TesteAdicionaMapaEspalhamento {
	public static void main(String[] args) {
		MapaEspalhamento<String, Carro> mapa = new MapaEspalhamento<>();
		
		System.out.println(mapa.tamanho());
		
		for(int i = 0; i < 2500; i++) {
			mapa.adiciona("*" + i, new Carro("*" + i));
		}
		
		mapa.adiciona("*teste0000", new Carro("* teste"));
		
		System.out.println("Tamanho " + mapa.tamanho());
		
		mapa.remove("*teste0000");
		System.out.println("Tamanho " + mapa.tamanho());
	}
	
}
