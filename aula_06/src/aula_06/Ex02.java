package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int busca = 0;

		numeros.add(2);
		numeros.add(5);
		numeros.add(4);
		numeros.add(8);
		numeros.add(9);
		numeros.add(1);
		numeros.add(7);
		numeros.add(6);
		numeros.add(1);

		System.out.println("Digite o número que você deseja encontrar:");
		busca = (int) leia.nextInt();

		if (numeros.contains(busca)) {
			System.out.println("O número " + busca + " está localizado na posição:" + numeros.indexOf(busca));
		} else {
			System.out.println("O número " + busca + " não foi encontrado!");
		}
	}
}
