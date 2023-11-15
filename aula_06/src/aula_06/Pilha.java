package aula_06;

import java.util.Stack;

public class Pilha {

    public static void main(String[]args){

        Stack<String>pilha=new Stack<String>();


        pilha.add("cleito");//adiciona valor a pilha
        pilha.add("cleitin");
        pilha.add("cleitao");
        pilha.push("clestovaldo");
        pilha.add("clistila");

        System.out.println(pilha);

        pilha.pop();//remove sempre o primeiro a ser adicionado

        System.out.println(pilha);

        System.out.println(pilha.peek());//apenas exibe o ultimo valor

        System.out.println(pilha.pop());//exibe o elemento e remove o que foi exibido

        System.out.println("o cleito esta na pilha:\n"+pilha.contains("cleito"));

        System.out.println("a clistila esta na pilha:\n"+pilha.contains("clistila"));

        System.out.println("o tamanho da pilha e: "+pilha.size());

        int cont=0;
        for (var pessoa : pilha) {
            cont++;
            if(pessoa.equalsIgnoreCase("clistila")){
                System.out.println("ele esta no "+cont+" lugar");
            }
        }
    }
}
