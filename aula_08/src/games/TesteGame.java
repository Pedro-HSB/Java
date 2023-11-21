package games;

import games.Produto;

public class TesteGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo game1 = new Jogo("god of war",200.00f,5,"o joguinho do deus da guerra","novo","luta");
		Jogo game2 = new Jogo("call of duty",250.00f,5,"o joguinho de tirro muito pica","novo","tiro");
		Console Console1 = new Console("playstation5",5000.00f,2,"e play ne pai","novo","slim");
		Console Console2 = new Console("xbox one",4000.00f,2,"tem bordlands","novo","slim");
		
		
		game1.visualizar();
		game2.visualizar();
		Console1.visualizar();
		Console2.visualizar();
	}

}
