package cliente;

public abstract class Cliente {
	
	private String nome;
	private String endereco;
	private int idade;
	private boolean cartao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public Cliente(String nome, String endereco, int idade, boolean cartao) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cartao = cartao;
	}

	public void visualisa() {
		System.out.println("seu nome e: " + this.nome);
		System.out.println("seu endereco e: " + this.getEndereco());
		System.out.println("sua idade e: "+this.getIdade());
		System.out.println("possui um cartao?\n"+this.isCartao()+"\n");
	}
}
