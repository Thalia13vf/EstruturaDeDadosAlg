package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class AtendimentoProntoSocorro {
	public static final int VERDE = 2;
	public static final int AMARELO = 1;
	public static final int VERMELHO = 0;
	
	public static void main(String[] args) {
		FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<Pessoa>();
		
		Pessoa p1 = new Pessoa("A", AMARELO);
		Pessoa p2 = new Pessoa("B", VERMELHO);
		Pessoa p3 = new Pessoa("C", VERDE);
		Pessoa p4 = new Pessoa("D", VERMELHO);
		Pessoa p5 = new Pessoa("E", AMARELO);
		Pessoa p6 = new Pessoa("F", VERDE);
		
		fila.enfileira(p1);
		fila.enfileira(p2);
		fila.enfileira(p3);
		fila.enfileira(p4);
		fila.enfileira(p5);
		fila.enfileira(p6);
		
		
		while(!fila.estaVazia()) {
			System.out.println(fila.desenfileira());
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
			
	}

}
