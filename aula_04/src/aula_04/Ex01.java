package aula_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1 = 0, numero2 = 0, numero3 = 0;

		System.out.println("Digite o primeiro número do intervalo:");
		numero1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1>numero2) {
			System.out.println("Intervalo inválido!");
		}
		else {
			for(int limit=1;limit<numero2;limit++) {
				if(limit%3==0 && limit%5==0) {
					System.out.println(limit+" é múltiplo de 3 e 5");
				}
			}
		}
	}

}
