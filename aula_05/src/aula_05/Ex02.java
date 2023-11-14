package aula_05;

import java.util.Scanner;

public class Ex02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = new int[10];

		int total = 0, last = 0;
		
		float media = 0.0f;

		System.out.println("");

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("digite o " + indice + " numero");
			numeros[indice] = leia.nextInt();
			total += numeros[indice];
			media += numeros[indice];
			last = indice;

		}
		System.out.println("Elementos nos índices ímpares:\n");
		for (int indice = 0; indice < 10; indice++) {

			if (indice % 2 == 1) {
				System.out.print(numeros[indice]);
			}
		}
		
		
		System.out.println("\nElementos pares:\n");
		for (int indice = 0; indice < 10; indice++) {
			if (numeros[indice] % 2 == 0) {
				System.out.print(numeros[indice]);
			}
		}
		System.out.println("\nSoma:\n" + total);
		System.out.println("\nMédia:\n" + media / last);
		System.out.println("\nMédia:\n" + total / last);
	}
}