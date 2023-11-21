package cliente;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, int idade, boolean cartao,String cnpj) {
		super(nome, endereco, idade, cartao);
		// TODO Auto-generated constructor stub
		this.cnpj=cnpj;
	}

}
