package cliente;

import cliente.Cliente;
public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("cleito","18904556789","rua dos cleito",20,false);
		Cliente cliente2 = new Cliente("cleitin","18904567789","rua dos cleito",25,false);
		Cliente cliente3 = new Cliente("cleitao","18676896789","rua dos cleito",30,false);
		
		cliente1.visualisa();
		cliente2.visualisa();
		cliente3.visualisa();

	}

}
