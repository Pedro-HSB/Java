package aula_03;

import java.util.Scanner;

public class Ex08 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valor,saldo = 1000.00f;
		int operacao;
		
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Deposito");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.print("Saldo da conta e "+ saldo);
			break;
			
		case 2:
			System.out.print("informe o valor do saque ");
			valor = leia.nextFloat();
			if (valor>=saldo) {
				System.out.print("novo Saldo da conta e "+ (saldo-valor));
			}
			else {
				System.out.print("Saldo insuficiente");
			}
			break;
			
		case 3:
			System.out.print("Saldo da conta e "+ saldo);
			valor = leia.nextFloat();
				System.out.print("novo Saldo da conta e "+ (saldo+valor));

			break;
			
		default:
			break;
			
		}

	}

}
