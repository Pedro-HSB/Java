package cliente;

import cliente.Cliente;
public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica pessoaFi1 = new PessoaFisica("cleito","18904556789",20,false,"12154784732");
		PessoaFisica pessoaFi2 = new PessoaFisica("cleitin","18904556789",25,false,"12154784732");
		PessoaJuridica pessoaJu1 = new PessoaJuridica("cleitao","18904556789",30,false,"12154784732");
		PessoaJuridica pessoaJu2 = new PessoaJuridica("cleitao","18904556789",35,false,"12154784732");
		
		pessoaFi1.visualisa();
		pessoaFi2.visualisa();
		pessoaJu1.visualisa();
		pessoaJu2.visualisa();

	}

}
