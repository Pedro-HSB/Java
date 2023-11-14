package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int busca;

		System.out.println("");
		
		for(int indice = 0;indice < 10; indice++){
			System.out.println("digite o "+indice+" numero");
			numeros[indice] = leia.nextInt();
		}
		
		System.out.println("qual numero deseja encontrar");
		busca = leia.nextInt();
		
		for(int indice = 0;indice < 10; indice++){
			if(busca==numeros[indice]){
				System.out.println("O numero "+busca+" está localizado na posição:" + indice);
			};
		}
	}
}