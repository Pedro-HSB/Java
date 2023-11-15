package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	static Scanner leia = new Scanner(System.in);

    public static void main(String[]args){

        ArrayList<String> cores =new ArrayList<String>();
        String cor;
		char letra;
        int i=0;

        for(int limit=0;limit<5;limit++) {
        	System.out.println("digite uma cor");
        	cor=leia.nextLine();
        	cores.add(cor);
        }

        System.out.println("Listar todas as cores:");
        System.out.println(cores);
        
        System.out.println("Ordenar as cores:");
        Collections.sort(cores);
        System.out.println(cores);

    }
}
