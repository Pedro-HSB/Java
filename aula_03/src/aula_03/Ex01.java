package aula_03;

import java.util.Scanner;

public class Ex01 {

	static Scanner leia= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte numero1,numero2,numero3;
		
		System.out.println("digite o primeiro numero");
		numero1 = leia.nextByte();
		
		System.out.println("digite o primeiro numero");
		numero2 = leia.nextByte();
		
		System.out.println("digite o primeiro numero");
		numero3 = leia.nextByte();
		
		if (numero1 + numero2 > numero3) {
			System.out.println(numero2 + " + " + numero1 + " = " + (numero1+numero2) + " > "+ numero3);
			System.out.println("\n A Soma de A + B é Maior do que C");
		}
		else if(numero1+numero2==numero3) {
			System.out.println(numero2 + " + " + numero1 + " = " + (numero1+numero2) + " = "+ numero3);
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.println(numero2 + " + " + numero1 + " = " + (numero1+numero2) + " < "+ numero3);
			System.out.println("A Soma de A + B é Igual do que C");
		}
	}

}
