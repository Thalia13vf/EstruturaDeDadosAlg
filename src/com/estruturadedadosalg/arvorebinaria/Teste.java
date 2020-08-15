package com.estruturadedadosalg.arvorebinaria;

public class Teste {
	public static void main(String[] args) {
		Arvore arvore = new Arvore(new Elemento(10));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		
		//System.out.println("O elemento 5 existe na �rvore? " + arvore.busca(5));
		
		arvore.imprimirPreOrdem();
		System.out.println();
		arvore.imprimirInOrdem();
		System.out.println();
		arvore.imprimirInOrdemInvertida();
		System.out.println();
		arvore.imprimirPosOrdem();
	}
}	
