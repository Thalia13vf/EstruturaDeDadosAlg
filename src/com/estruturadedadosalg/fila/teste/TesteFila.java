package com.estruturadedadosalg.fila.teste;

import com.estruturadedadosalg.fila.Aluno;
import com.estruturadedadosalg.fila.Fila;

public class TesteFila {
	public static void main(String[] args) {
		Fila<Aluno> fila = new Fila<>();
		
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		System.out.println(alunoRemovido);
		
		if(fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
}
