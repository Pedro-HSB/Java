package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	
	static Scanner leia = new Scanner(System.in);

	public  static void main(String[]args){
        HashSet<Integer> numeros=new HashSet<Integer>();
        Integer numero=0;

        for(int limit=0;limit<10;limit++) {
        	System.out.println("digite um numero");
        	numero=leia.nextInt();
        	numeros.add(numero);
        }
		Iterator<Integer> iNumeros=numeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println("Listar dados do Set:");
			System.out.println(iNumeros.next());
		}
    }

}
