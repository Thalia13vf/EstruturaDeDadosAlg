package com.estruturadedadosalg.mapas.teste;

import java.util.HashMap;
import java.util.Map;

import com.estruturadedadosalg.mapas.Carro;

public class TesteHashMap {
	public static void main(String[] args) {
		Map<String, Carro> mapa = new HashMap<>();
		
		mapa.put("abc1234", new Carro("a"));
		System.out.println(mapa);
		
		mapa.put("abc1234", new Carro("b"));
		System.out.println(mapa);
		
		mapa.put("def1234", new Carro("c"));
		System.out.println(mapa);
		
		System.out.println(mapa.size());
		
		System.out.println(mapa.containsKey("abc1234"));
		
		System.out.println(mapa.get("def1234"));
		
		mapa.remove("abc1234");
		
		System.out.println(mapa);
		
	}
}
