package com.estruturadedadosalg.sort.bubble;

public class TesteBubbleSort2 {
	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		int[] array = {8, 3 , 4, 1, 2, 0, 9};
		
		bubble.setVetor(array);
		bubble.bubbleSort();
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
	}
}
