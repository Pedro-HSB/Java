package aula_03;

import java.util.Scanner;

public class Ex03 {

	static Scanner leia= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		String nome;
		
		boolean doacao;
		
		System.out.print("Digite o Nome do doador:");
		leia.skip("\\R");
		nome=leia.nextLine();
		
		System.out.print("Digite a Idade do doador:");
		idade=leia.nextByte();
		
		System.out.print("Primeira doação de sangue?");
		doacao = leia.nextBoolean();
		
		if(idade<18) {
			System.out.print(nome+" não está apto para doar sangue!");
		}
		else if(idade>60 && idade<69 && doacao!=false) {
			System.out.print(nome+" está apto para doar sangue!");
		}
		else if(idade>18 && idade<60) {
			System.out.print(nome+" está apto para doar sangue!");
		}	
		else if(idade>60 && idade<69 && doacao==false) {
			System.out.print(nome+" está apto para doar sangue!");
		}	
		else {
			System.out.print(nome+" não está apto para doar sangue!");
		}
		
	}

}
