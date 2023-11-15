package aula_04;

import java.util.Scanner;

public class Ex02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int numero=0,par=0,impar=0;

		for(int limit=0;limit<numeros.length;limit++) {
			System.out.println("Digite o "+limit+"º número:");
			numero=leia.nextInt();
			if(numero%2==0)
				par++;
			else
				impar++;
			numeros[limit]=numero;
		}
		System.out.println("Total de números pares: "+par);
		System.out.println("Total de números ímpares: "+impar);
	}

}
