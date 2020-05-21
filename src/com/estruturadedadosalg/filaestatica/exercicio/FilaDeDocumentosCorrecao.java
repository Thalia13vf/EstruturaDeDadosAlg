package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.Fila;

public class FilaDeDocumentosCorrecao {
	public static void main(String[] args) {
		Fila<Documento> filaDaImpressora = new Fila<>();
		
		filaDaImpressora.enfileira(new Documento("A", 1));
		filaDaImpressora.enfileira(new Documento("B", 2));
		filaDaImpressora.enfileira(new Documento("C", 3));
		filaDaImpressora.enfileira(new Documento("D", 7));
		filaDaImpressora.enfileira(new Documento("E", 9));
		
		while(!filaDaImpressora.estaVazia()) {
			Documento doc = filaDaImpressora.desenfileira();
			System.out.println("Imprimindo documento " + doc.getNome());
			try {
				Thread.sleep(200 * doc.getQuantidadePaginas());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Todos os documentos foram impressos");
		
		
	}
}
