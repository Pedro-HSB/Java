package aula_03;

import java.util.Scanner;

public class Ex07 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[]args) {
		
		
		float numero1,numero2;
		
		int operacao;


		System.out.println(
				"Código		|	Operação"
				+ "\n"
				+ "\n1		|Soma	"
				+ "\n2		|Subtração	"
				+ "\n3		|Multiplicação	"
				+ "\n4		|Divisão	");

		System.out.print("\n Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.print("\n Digite o 2º número:");
		numero2 = leia.nextFloat();
		
		System.out.print("\n Operação::");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println(numero1+" + " + numero2 +" = " +(numero1+numero2));
			break;

		case 2:
			System.out.println(numero1+" - " + numero2 +" = " +(numero1-numero2));
			break;

		case 3:
			System.out.println(numero1+" * " + numero2 +" = " +(numero1*numero2));
			break;

		case 4:
			System.out.println(numero1+" / " + numero2 +" = " +(numero1/numero2));
			break;

		default:
			System.out.print("Codigo invalido");
			break;
		}
	}
}
