package com.estruturadedadosalg.filaestatica.exercicio;

import java.util.Random;

import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class PSNovosPacientes implements Runnable{

	private FilaComPrioridade<Pessoa> fila;
	private int contador = 7;
	private Random prioridade = new Random();
	
	public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}


	@Override
	public void run() {
		for(int i = 0; i < 8; i++) {
			try {
				Thread.sleep(8000);
				Pessoa p = new Pessoa(""+contador, prioridade.nextInt(3));
				fila.enfileira(p);
				contador++;
				System.out.println(p + " enfileirada.");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
