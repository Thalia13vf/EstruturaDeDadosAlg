package com.estruturadedadosalg.pilha.exercicios;

import com.estruturadedadosalg.pilha.Pilha;

public class PilhaDeEmails {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		Pilha<Email> pilha = new Pilha<>();
		
		Email e1 = new Email("ana@gmail.com", "teste@gmail.com","Teste","Teste");
		Email e2 = new Email("maria@gmail.com", "teste@gmail.com","Teste","Teste");
		Email e3 = new Email("paulo@gmail.com", "teste@gmail.com","Teste","Teste");
		Email e4 = new Email("anamaria@gmail.com", "teste@gmail.com","Teste","Teste");
		Email e5 = new Email("marco@gmail.com", "teste@gmail.com","Teste","Teste");
	
		pilha.insere(e1);
		pilha.insere(e2);
		pilha.insere(e3);
		pilha.insere(e4);
		pilha.insere(e5);
		
		for(int i = 0; i < 5; i++) {
			pilha.remove().enviar();
		}
		
		long fim = System.currentTimeMillis();
		System.out.println("Pilha com lista ligada " + (fim - inicio) /1000.0);
	
		inicio = System.currentTimeMillis();
		com.estruturadedadosalg.pilhaestatica.Pilha<Email> estatica = new 
				com.estruturadedadosalg.pilhaestatica.Pilha<Email>();
		
		Email t1 = new Email("ana@gmail.com", "teste@gmail.com","Teste","Teste");
		Email t2 = new Email("maria@gmail.com", "teste@gmail.com","Teste","Teste");
		Email t3 = new Email("paulo@gmail.com", "teste@gmail.com","Teste","Teste");
		Email t4 = new Email("anamaria@gmail.com", "teste@gmail.com","Teste","Teste");
		Email t5 = new Email("marco@gmail.com", "teste@gmail.com","Teste","Teste");
	
		estatica.empilha(t1);
		estatica.empilha(t2);
		estatica.empilha(t3);
		estatica.empilha(t4);
		estatica.empilha(t5);
		
		for(int i = 0; i < 5; i++) {
			estatica.desempilha().enviar();
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Pilha com Vetor " + (fim - inicio) /1000.0);
	
	}
	

}
