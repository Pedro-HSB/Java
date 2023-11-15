package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {

	
	static Scanner leia = new Scanner(System.in);

	public  static void main(String[]args){
        HashSet<Integer> numeros=new HashSet<Integer>();
        Integer numero=0;

        for(int limit=0;limit<10;limit++) {
        	System.out.println("digite um numero");
        	numero=leia.nextInt();
        	numeros.add(numero);
        }
        
        System.out.println("Digite o número que você deseja encontrar:");
    	numero=leia.nextInt();
        if(numeros.contains(numero)==true) {
        	System.out.println("O número "+numero+" foi encontrado!");
        }else
        	System.out.println("O número "+numero+"não foi encontrado!");
        	
    }

}
