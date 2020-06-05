package com.estruturadedadosalg.fila.teste;

import java.util.LinkedList;
import java.util.Queue;
import com.estruturadedadosalg.fila.Aluno;

public class TesteQueue {
	public static void main(String[] args) {
		Queue<Aluno> fila = new LinkedList<Aluno>(); 
		
		Aluno aluno = new Aluno();
		System.out.println(fila.offer(aluno));
		
		Aluno alunoRemovido = fila.poll();
		
		System.out.println(alunoRemovido);
		
		if(fila.isEmpty()) {
			System.out.println("A fila está vazia");
		}
	}
}
