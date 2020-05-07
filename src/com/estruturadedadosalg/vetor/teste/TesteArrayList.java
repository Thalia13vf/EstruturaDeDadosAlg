package com.estruturadedadosalg.vetor.teste;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Elemento existe no array");
		}
		else {
			System.out.println("Elemento não existe no array");
		}
		
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		}
		else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		System.out.println("Contém " + arrayList.contains("C"));
		
		arrayList.add("C");
		arrayList.add(2, "C");
		
		System.out.println("último indice: " + arrayList.lastIndexOf("K"));
		arrayList.clear();
		System.out.println(arrayList);
	}
}
