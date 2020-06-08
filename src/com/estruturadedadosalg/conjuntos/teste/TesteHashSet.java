package com.estruturadedadosalg.conjuntos.teste;

import java.util.HashSet;

public class TesteHashSet {
	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<>();
		
		conjunto.add("Rafael");
		conjunto.add("Rafael");
		conjunto.add("Ana");
		conjunto.add("Paulo");
		
		System.out.println(conjunto);
		System.out.println(conjunto.size());
	}
}
