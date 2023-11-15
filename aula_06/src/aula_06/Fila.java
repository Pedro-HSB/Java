package aula_06;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[]args){

        Queue<String> fila = new LinkedList<String>();

        fila.add("cleito");//adiiciona valor a fila
        fila.add("cleitin");
        fila.add("cleitao");
        fila.add("clestovaldo");
        fila.add("clistila");

        System.out.println(fila);

        fila.remove();//remove sempre o primeiro a ser adicionado

        System.out.println(fila);

        System.out.println(fila.peek());//apenas exibe o primeiro valor

        System.out.println(fila.poll());//exibe o elemento e remove o que foi exibido

        System.out.println("o cleito esta na fila:\n"+fila.contains("cleito"));

        System.out.println("a clistila esta na fila:\n"+fila.contains("clistila"));

        System.out.println("o tamanho da fila e: "+fila.size());

        int cont=0;
        for (var pessoa : fila) {
            cont++;
            if(pessoa.equalsIgnoreCase("clistila")){
                System.out.println("ele esta no "+cont+" lugar");
            }
        }
    }
}