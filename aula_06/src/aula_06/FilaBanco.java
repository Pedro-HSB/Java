package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		int opcao;

		String nome;

		while (true) {
			System.out.println("\n**********************************************************");
			System.out.println("");
			System.out.println("	1 - adicionar cliente		");
			System.out.println("	2 - listar todos os clientes");
			System.out.println("	3 - retirar cliente da fila	");
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
				System.out.print("\n adicionando novo cliente");
				System.out.print("\n qual o nome do cliente\n");
				leia.skip("\\R");
				nome = leia.nextLine();

				fila.add(nome);

				System.out.print("\n cliente adicionado com sucesso");
				break;

			case 2:
				System.out.println("\n listando todos os clientes");

				Iterator<String> iFila = fila.iterator();

				while (iFila.hasNext()) {
					System.out.println(iFila.next());
				}
				break;

			case 3:
				System.out.print("\n retirando clientes da fila");
				if (fila.isEmpty())
					System.out.print("\n fila esta vazia");

				else {
					fila.remove();
					System.out.print("\n cliente retirado com sucesso");
				}
				break;

			default:

				break;
			}
		}
	}

}
