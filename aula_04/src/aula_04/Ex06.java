package aula_04;

import java.util.Scanner;

public class Ex06 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero=0,total=0,todos=0;
		
		do {
			System.out.println("Digite um número: ");
			numero=leia.nextInt();
			if(numero%3==0)
				total+=numero;
				todos++;
				
		}while(numero==0);
		System.out.println("A média de todos os números múltiplos de 3 é:"+total/todos);
	}

}
