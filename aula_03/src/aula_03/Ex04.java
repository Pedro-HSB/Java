package aula_03;

import java.util.Scanner;

public class Ex04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tipo;

		System.out.println("");
		leia.skip("\\R");
		tipo = leia.nextLine();
		
		if (tipo.equalsIgnoreCase("vertebrado")) 
		{
			System.out.println("");
			leia.skip("\\R");
			tipo = leia.nextLine();
			
			if (tipo.equalsIgnoreCase("ave")) 
			{
				System.out.println("");
				leia.skip("\\R");
				tipo = leia.nextLine();
				
				if (tipo.equalsIgnoreCase("carnívoro")) 
				{
					System.out.println("Aguia");
				}
				else 
				{
					System.out.println("pomba");
				}
				
			} 
			else
			{
				System.out.println("");
				leia.skip("\\R");
				tipo = leia.nextLine();
				
				if (tipo.equalsIgnoreCase("onívoro")) 
				{
					System.out.println("Homem");
				}
				else
				{
					System.out.println("Vaca");
				}
			}
		} 
		else
		{
			System.out.println("");
			leia.skip("\\R");
			tipo = leia.nextLine();
			
			if (tipo.equalsIgnoreCase("inseto")) 
			{
				System.out.println("");
				leia.skip("\\R");
				tipo = leia.nextLine();
				
				if (tipo.equalsIgnoreCase("herbívoro")) 
				{
					System.out.println("lagarta");
				}
				else 
				{
					System.out.println("Pulga");
				}
			} 
			else
			{
				System.out.println("");
				leia.skip("\\R");
				tipo = leia.nextLine();
				
				if (tipo.equalsIgnoreCase( "onívoro")) 
				{
					System.out.println("Minhoca");
				}
				else
				{
					System.out.println("Sanguessuga");
				}
			}
		}
	}

}
