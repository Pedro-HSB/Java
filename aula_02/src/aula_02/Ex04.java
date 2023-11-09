package aula_02;
import java.util.Scanner;

public class Ex04 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1,n2,n3,n4,resultado;
		// TODO Auto-generated method stub
		System.out.println("");
		n1=leia.nextFloat();
		System.out.println("");
		n2=leia.nextFloat();
		System.out.println("");
		n3=leia.nextFloat();
		System.out.println("");
		n4=leia.nextFloat();
		
		resultado=(n1*n2)-(n3*n4);
		
		System.out.println("A diferenca e :" + resultado);
	}

}
