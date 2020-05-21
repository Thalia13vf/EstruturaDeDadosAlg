package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class PSAtendimento implements Runnable{
	
	private FilaComPrioridade<Pessoa> fila;
	
	public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		while(!fila.estaVazia()) {
			
			try {
				Thread.sleep(5000);
				System.out.println(fila.desenfileira() + " atendida!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Atendidmento concluído");
	}

}
