package aula_02;

import java.util.Scanner;

public class Ex03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioB,Adicional,Extras ,Descontos ;
		
		System.out.println("Salário Bruto:");
		salarioB = leia.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		Adicional = leia.nextFloat();
		
		System.out.println("Horas Extras:");
		Extras = leia.nextFloat();
		
		System.out.println("Descontos:");
		Descontos = leia.nextFloat();
		
		System.out.printf("seu novo salario e: " +(salarioB + Adicional +(Extras * 5)- Descontos));
	}

}
