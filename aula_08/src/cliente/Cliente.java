package cliente;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private boolean cartao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isCartao() {
		return cartao;
	}

	public void setCartao(boolean cartao) {
		this.cartao = cartao;
	}
	
	public Cliente(String nome, String cpf, String endereco, int idade, boolean cartao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
		this.cartao = cartao;
	}

	public void visualisa() {
		System.out.println("seu nome e: " + this.nome);
		System.out.println("seu cpf e: " + this.getCpf());
		System.out.println("seu endereco e: " + this.getEndereco());
		System.out.println("sua idade e: "+this.getIdade());
		System.out.println("possui um cartao?\n"+this.isCartao()+"\n");
	}
}
