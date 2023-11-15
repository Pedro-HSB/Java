package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		int opcao;

		String nome;

		while (true) {
			System.out.println("\n**********************************************************");
			System.out.println("");
			System.out.println("	1 - adicionar livro na pilha		");
			System.out.println("	2 - listar todos os livros");
			System.out.println("	3 - retirar livro da pilha	");
			System.out.println("	0 - encerrar  programa		");
			System.out.println("");
			System.out.println("**********************************************************");
			System.out.println("");
			System.out.println("\ndigite a opcao desejada");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.print("\n programa finalizado");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.print("\n adicionando novo livro");
				System.out.print("\n qual o nome do livro:\n");
				leia.skip("\\R");
				nome = leia.nextLine();

				livros.add(nome);

				System.out.print("\n livro adicionado com sucesso");
				break;

			case 2:
				System.out.println("\n listando todos os livros");

				Iterator<String> iLivros = livros.iterator();

				while (iLivros.hasNext()) {
					System.out.println(iLivros.next());
				}
				break;

			case 3:
				System.out.print("\n retirando livros da fila");
				if (livros.isEmpty())
					System.out.print("\n pilha esta vazia");

				else {
					livros.pop();
					System.out.print("\n livro retirado com sucesso");
				}
				break;

			default:

				break;
			}
		}
	}

}
