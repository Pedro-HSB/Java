package aula_04;

import java.util.Scanner;

public class Ex03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int mais=0,menos=0,idade=0,limit=1;
		
		while(limit>0) {
			System.out.println("Digite uma idade:");
			idade=leia.nextInt();
			if(idade>51)
				mais++;
			else if(idade<21)
				menos++;
			else
				limit--;
				
		}
		System.out.println("Total de pessoas menores de 21 anos: "+menos);
		System.out.println("Total de pessoas maiores de 50 anos: "+mais);
	}

}
