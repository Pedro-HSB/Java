package aula_03;

import java.util.Scanner;

public class Ex05 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float preco;
		int produto,qtd;
		
		System.out.println("Código do Produto		|	Produto			|	Preço Unitário"
							+ "\n"
							+ "\n1				|	Cachorro Quente		|		R$ 10.00	"
							+ "\n2				|	X-Salada		|		R$ 15.00	"
							+ "\n3				|	X-Bacon			|		R$ 18.00	"
							+ "\n4				|	Bauru			|		R$ 12.00	"
							+ "\n5				|	Refrigerante		|		R$ 8.00		"
							+ "\n6				|	Suco de laranja		|		R$ 13.00	");
		
		System.out.print("\n Código do Produto:");
		produto = leia.nextInt();
		System.out.print("\n Quantidade:");
		qtd = leia.nextInt();
		
		switch (produto){
			case 1:
				System.out.println("Produto: Cachorro Quente");
				preco=(float) 10.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			case 2:
				System.out.println("Produto: X-Salada");
				preco=(float) 15.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			case 3:
				System.out.println("Produto: X-Bacon");
				preco=(float) 18.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			case 4:
				System.out.println("Produto: Bauru");
				preco=(float) 12.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			case 5:
				System.out.println("Produto: Refrigerante");
				preco=(float) 8.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			case 6:
				System.out.println("Produto: Suco de laranja");
				preco=(float) 13.00;
				System.out.print("\n Valor total:"+(qtd*preco));
				break;
				
			default:
				System.out.print("Codigo invalido");
				break;
		}
		
		
	}

}
