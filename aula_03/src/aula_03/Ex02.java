package aula_03;

import java.util.Scanner;

public class Ex02 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte numero1;
		
		System.out.println("digite um numero");
		numero1 = leia.nextByte();
		
		if (numero1>0 && numero1%2==0) {
			System.out.println("O Número "+numero1+" é par e positivo!");
		}
		else if(numero1<0 && numero1%2==0) {
			System.out.println("O Número "+numero1+" é par e negativo!");
		}
		else if(numero1<0 && numero1%2==1) {
			System.out.println("O Número "+numero1+" é impar e negativo!");
		}
		else {
			System.out.println("O Número "+numero1+" é impar e positivo!");
		}
	}

}
