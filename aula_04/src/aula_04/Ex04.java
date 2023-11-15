package aula_04;

import java.util.Scanner;

public class Ex04 {

static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idade, genero, dev, backend = 0, frontend = 0, mobile = 0, fullStack = 0, total = 0, somaIdade = 0;
		float media = 0.0f;
		String continua = "S";

		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Digite o Genero "
						+ "\n 1-Mulher cis"
						+ "\n 2-Homem Cis"
						+ "\n 3-Não Binário"
						+ "\n 4-Mulher Trans"
						+ "\n 5-Homem Trans"
						+ "\n 6-Outros: ");
				genero = leia.nextInt();
				
				if (genero < 1 || genero > 6)
					System.out.println("Digite um valor entre 1 e 6");
				
			}while(genero < 1 || genero > 6);
			
			do {
				System.out.println("Digite a categoria da Pessoa Desenvolvedora"
						+ "\n 1-Backend"
						+ "\n 2-Frontend"
						+ "\n 3-Mobile"
						+ "\n 4-FullStack: ");
				dev = leia.nextInt();
				
				if (dev < 1 || dev > 4)
					System.out.println("Digite um valor entre 1 e 4");
				
			}while(dev < 1 || dev > 4);
			
			if(dev == 1)
				backend ++;
			
			if(dev == 2 && (genero == 1 || genero == 4))
				frontend ++;
			
			if(dev == 3 && (genero == 2 || genero == 5) && idade > 40)
				mobile ++;
			
			if(dev == 4 && genero == 3 && idade < 30)
				fullStack ++;
			
			total ++;
			
			somaIdade += idade;
			
			media = (float)somaIdade / total;
			
			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras backendend: " + backend);
		System.out.println("Total de pessoas desenvolvedoras frontendend Mulheres Cis e Trans: " + frontend);
		System.out.println("Total de pessoas desenvolvedoras Mobile Homens Cis e Trans maiores de 40 anos: " 
				+ mobile);
		System.out.println("Total de pessoas desenvolvedoras fullStackstack Não Binários menores de 30 anos: " + fullStack);
		System.out.println("Total de pessoas desenvolvedoras que responderam a pesquisa: " + total);
		System.out.printf("Média de idade das pessoas desenvolvedoras: %.2f", media);
		
	}
}
