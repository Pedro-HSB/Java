package games;

import games.Produto;

public class TesteGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto game1 = new Produto("god of war",200.00f,5,"o joguinho do deus da guerra","novo");
		Produto game2 = new Produto("call of duty",250.00f,5,"o joguinho de tirro muito pica","novo");
		Produto game3 = new Produto("mid nigth club",150.00f,5,"o joguinho de corrida muito pica","novo");
		
		
		game1.visualizar();
		game2.visualizar();
		game3.visualizar();
	}

}
