package cliente;

public class PessoaFisica extends Cliente{
	private String cpf;
	
	public PessoaFisica(String nome, String endereco, int idade, boolean cartao,String cpf) {
		
		super(nome, endereco, idade, cartao);
		// TODO Auto-generated constructor stub
		this.cpf=cpf;
	}

}
