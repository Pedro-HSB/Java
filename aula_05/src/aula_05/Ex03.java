package aula_05;

import java.util.Scanner;

public class Ex03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros [][]= {{1,2,3},{4,5,6},{7,8,9}};

		int ex=0,totalP=0,totalS=0;


		System.out.println("Elementos da Diagonal Principal:");

		for (int indiceL = 0; indiceL < numeros.length; indiceL++) {
			for (int indiceC = 0; indiceC < numeros.length; indiceC++) {

				if (indiceL== indiceC) {
					System.out.print(+numeros[indiceL][indiceC]);
					totalP+=numeros[indiceL][indiceC];
				}
			}
		}
		System.out.println("\nElementos da Diagonal Secundária:");
		
		for (int indiceL = 0; indiceL < numeros.length; indiceL++) {
			System.out.print(numeros[indiceL][numeros.length - 1 - indiceL]);
			totalS += numeros[indiceL][numeros.length - 1 - indiceL];
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal:\n"+totalP);
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n"+totalS);
	}

}
