package com.estruturadedadosalg.fila.teste;

import com.estruturadedadosalg.fila.Aluno;
import com.estruturadedadosalg.fila.Fila;

public class TesteTipos {
	public static void main(String[] args) {
		Fila<Aluno> fila = new Fila<>();
		
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		
		if(fila.vazia()) {
			System.out.println("A fila de alunos está vazia");
		}
		
		Fila<String> filaDeStrings = new Fila<>();
		filaDeStrings.insere("Adelaide");
		filaDeStrings.insere("Carolina");
		
		String adelaide = filaDeStrings.remove();
		String carolina = filaDeStrings.remove();
		
		System.out.println(adelaide);
		System.out.println(carolina);
		
	}
}
