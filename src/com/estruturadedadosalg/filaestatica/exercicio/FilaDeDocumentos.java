package com.estruturadedadosalg.filaestatica.exercicio;

import com.estruturadedadosalg.filaestatica.FilaComPrioridade;

public class FilaDeDocumentos {
	public static void main(String[] args) {
		FilaComPrioridade<Documento> fila = new FilaComPrioridade<Documento>();
		Documento doc1 = new Documento("Doc1", 19);
		Documento doc2 = new Documento("Doc2", 30);
		Documento doc3 = new Documento("Doc3", 2);
		Documento doc4 = new Documento("Doc4", 21);
		Documento doc5 = new Documento("Doc5", 3);
		Documento doc6 = new Documento("Doc6", 2);
		
		fila.enfileira(doc1);
		fila.enfileira(doc2);
		fila.enfileira(doc3);
		fila.enfileira(doc4);
		fila.enfileira(doc5);
		fila.enfileira(doc6);
		
		for(int i = fila.tamanho(); i > 0; i--) {
			System.out.println(fila.desenfileira());
		}
	}
}
