package aula_02;
import java.util.Scanner;

public class Ex04 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1,n2,n3,n4,resultado;
		// TODO Auto-generated method stub
		System.out.println("digite o primeiro numero:");
		n1=leia.nextFloat();
		
		System.out.println("digite o segundo numero:");
		n2=leia.nextFloat();
		
		System.out.println("digite o terceiro numero:");
		n3=leia.nextFloat();
		
		System.out.println("digite o quarto numero:");
		n4=leia.nextFloat();
		
		resultado=(n1*n2)-(n3*n4);
		
		System.out.println("A diferenca e :" + resultado);
	}

}
