package aula_05;

import java.util.Scanner;

public class Ex04 {
	
	static Scanner leia = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			float notas [][]= new float[2][4];

			float media[] = new float[4];
			int indi =0;

			for (int indiceL = 0; indiceL < notas.length; indiceL++) {
				for (int indiceC = 0; indiceC < notas[indiceL].length; indiceC++) {

						System.out.print("digite a nota:\n");
						notas[indiceL][indiceC]=leia.nextFloat();
				}
			}
			
			
			for (int indiceL = 0; indiceL < notas.length; indiceL++) {
				for (int indiceC = 0; indiceC < notas[indiceL].length; indiceC++) {
						media[indiceL]+=notas[indiceL][indiceC];
				}
			}
			
				for(int indice = 0;indice<media.length;indice++) {
					System.out.print("\n"+media[indice]/notas[0].length);
					}
	}


}
