package com.estruturadedadosalg.arvorebinaria;

public class TesteRemocao {
	public static void main(String[] args) {
		Elemento e1 = new Elemento();
		
		Arvore arvore = new Arvore(new Elemento(20));
		arvore.inserir(new Elemento(10));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(2));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		
		arvore.inserir(new Elemento(30));
		arvore.inserir(new Elemento(25));
		arvore.inserir(new Elemento(22));
		arvore.inserir(new Elemento(28));
		arvore.inserir(new Elemento(35));
		arvore.inserir(new Elemento(32));
		arvore.inserir(new Elemento(38));
		arvore.imprimirInOrdem();
		System.out.println("");
		
		e1.setValor(38);
		arvore = arvore.remover(e1);
		
		arvore.imprimirInOrdem();
		
		e1.setValor(35);
		arvore = arvore.remover(e1);
		System.out.println();
		arvore.imprimirInOrdem();
		
		//tirar nó raiz
		e1.setValor(20);
		arvore = arvore.remover(e1);
		System.out.println();
		arvore.imprimirInOrdem();
	}
}
