package aula_02;

import java.util.Scanner;

public class Ex01 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario,abono;
		
		System.out.println("Digite seu salario:");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono:");
		abono = leia.nextFloat();
		
		System.out.printf("seu novo salario e: " +(salario + abono));
	}

}
