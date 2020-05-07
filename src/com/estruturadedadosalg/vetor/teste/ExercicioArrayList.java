package com.estruturadedadosalg.vetor.teste;

import java.util.ArrayList;

import com.estruturadedadosalg.vetor.Vetor;

public class ExercicioArrayList {
	
	public static void main (String[] args) {
		Vetor<Contato> contatos = new Vetor<Contato>(15);
		ArrayList<Contato> lista = new ArrayList<Contato>(15);
		
		for(int i = 0; i < 30; i++) {
			Contato contato = new Contato();
			contato.setNome("contato" + i);
			contatos.adiciona(contato);
		}
		System.out.println(contatos);
		
		for(int i = 0; i < contatos.tamanho(); i++) {
			lista.add(contatos.obtem(i));
		}
		
		Contato con = new Contato();
		con.setNome("teste");
		lista.add(0, con);
		
		System.out.println(lista);
		
		System.out.println(lista.contains(con));
		
		System.out.println(lista.lastIndexOf(con));
		
		System.out.println(lista.get(0));
		
		System.out.println("Tamanho " + lista.size());
		
		System.out.println("Remove "+ lista.remove(con));
		
		System.out.println(lista);
		
		lista.clear();
		
		System.out.println("Tamanho atual: " + lista.size());
		System.out.println(lista);
	}
	
}
