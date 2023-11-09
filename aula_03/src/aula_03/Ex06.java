package aula_03;

import java.util.Scanner;

public class Ex06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Salario;

		int cargo;

		String nome;

		System.out.println(
				"Código do Cargo	|	Cargo	|	Percentual do Reajuste" 
				+ "\n"
				+ "\n1		|Gerente	|	10%"
				+ "\n2		|Vendedor	|	7%"
				+ "\n3		|Supervisor	|	9%"
				+ "\n4		|Motorista	|	6%"
				+ "\n5		|Estoquista	|	5%"
				+ "\n6		|Técnico de TI	|	8%");

		System.out.print("\n Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("\n Cargo:");
		cargo = leia.nextInt();
		
		System.out.print("\n Salário:");
		Salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Gerente");
			System.out.print("\n Salário:R$ " + (Salario + (0.10  * Salario)));
			break;

		case 2:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Vendedor");
			System.out.print("\n Salário:R$ " + (Salario + (0.07 * Salario)));
			break;

		case 3:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Supervisor");
			System.out.print("\n Salário:R$ " + (Salario + (0.09  * Salario)));
			break;

		case 4:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Motorista");
			System.out.print("\n Salário:R$ " + (Salario + (0.06  * Salario)));
			break;

		case 5:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Estoquista");
			System.out.print("\n Salário:R$ " + (Salario + (0.05  * Salario)));
			break;

		case 6:
			System.out.print("\n Nome do colaborador: " + nome);
			System.out.print("\n Cargo: Técnico de TI");
			System.out.print("\n Salário:R$ " + (Salario + (0.08  * Salario)));
			break;

		default:
			System.out.print("Codigo invalido");
			break;
		}
	}

}
