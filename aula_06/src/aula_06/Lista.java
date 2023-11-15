package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[]args){

        Integer num=0;
        ArrayList<Double> notas=new ArrayList<Double>();
        Double numero;

        /*System.out.println("digite uma nota");
        numero=leia.nextDouble();

        notas.add(numero);*/
        notas.add(9.0);
        notas.add(10.0);
        notas.add(2.0);
        notas.add(7.0);

        for (var nota:notas)
            System.out.println(nota);

        System.out.println(notas);

        System.out.println("psocisao do elemento 7:\n " + notas.indexOf(7.0));//procura um elemento passado no index e retorna a posicao

        System.out.println("existe o elemento 7:\n " + notas.contains(7.0));//procura um elemento passado no index e retorna true or false

        System.out.println("elemento na posicao 0:\n " + notas.get(0));//procura um elemento passado no index e retorna true or false

        notas.remove(3);

        System.out.println(notas);

        notas.forEach(System.out::println);

        notas.clear();

        System.out.println("a lista esta vazia\n"+notas.isEmpty());
    }
}