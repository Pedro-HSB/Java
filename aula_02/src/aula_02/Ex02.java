package aula_02;

import java.util.Scanner;

public class Ex02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1,nota2,nota3,nota4;
		
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		nota4 = leia.nextFloat();
		
		System.out.printf("seu novo salario e: " +((nota1 + nota2 +nota3+nota4)/4));
	}

}
