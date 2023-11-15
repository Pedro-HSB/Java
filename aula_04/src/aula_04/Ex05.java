package aula_04;

import java.util.Scanner;

public class Ex05 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero=0,limit=1;
		
		do {
			System.out.println("Digite um número: ");
			numero+=leia.nextInt();
				
		}while(limit>0);
		System.out.println("A soma dos números positivos é: "+numero);
	}
}
