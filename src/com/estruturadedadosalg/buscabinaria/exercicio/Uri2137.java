package com.estruturadedadosalg.buscabinaria.exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri2137 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testes = 0;
		
		testes = Integer.parseInt(br.readLine());
		
		int[] numeros = new int[testes];
		
		for(int i = 0; i < testes; i++) {
				numeros[i] = Integer.parseInt(br.readLine());
		}
	
		int numero, i, c;
		for(i = 1; i < numeros.length ;i++) {
			numero = numeros[i];
			
			for(c = i - 1; (c >= 0) && numeros[c] > numero; c--) {
				numeros[c + 1] = numeros[c];
			}
			numeros[c + 1] = numero;
		}
		
		for(int j = 0; j < numeros.length; j++) {
			String f = String.format("%04d", numeros[j]);
			System.out.println(f);
		}
		
		br.close();
		
	}
}
