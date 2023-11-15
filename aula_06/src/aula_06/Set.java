package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public  static void main(String[]args){
        HashSet<String> frutas=new HashSet<String>();

        frutas.add("abacate");//adiciona valor do parenteses
        frutas.add("laranja");
        frutas.add("banana");
        frutas.add("abacate");
        frutas.add("morango");
        frutas.add("kiwi");
        frutas.add("");
        //frutas.add(null);

        System.out.println(frutas);

        for (var fruta :frutas) {
            System.out.println(fruta.hashCode());//mostra um codigo que e criado quando o valor e adicionado
        }
        System.out.println("a fruta morango existe"+frutas.contains("morango")+"\n");// faz uma busca do que esta dentro do parenteses

        frutas.remove("morango");//remove um valor do vetor

        System.out.println(frutas);
        //interage com outros vetores
        Iterator<String> iFrutas=frutas.iterator();

        while(iFrutas.hasNext())
            System.out.println(iFrutas.next());//se tem um proximo objeto dentro do vetor


        ArrayList<String> frutasList=new ArrayList<String>();

        frutasList.addAll(frutas);

        frutasList.sort(null);

        frutasList.sort(Comparator.reverseOrder());

        System.out.println(frutasList);
        //frutas.toArray();
    }
}