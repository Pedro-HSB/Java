package farmacia;

public class Farmacia {


	private String produto;
	private String endereco;
	private String funcionario;
	private float cnpj;
	private String nome;
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public float getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Farmacia(String produto, String endereco, String funcionario, float cnpj, String nome) {
		this.produto = produto;
		this.endereco = endereco;
		this.funcionario = funcionario;
		this.cnpj = cnpj;
		this.nome = nome;
	}
	
	
	public void visualizar() {
			System.out.println("seu nome e: " + this.getNome());
			System.out.println("seu cnpj e: " + this.getCnpj());
			System.out.println("seu endereco e: " + this.getEndereco());
			System.out.println("o gerente responsavel e: "+this.getFuncionario());
			System.out.println("o produto e: "+this.getProduto()+"\n");
		
	}
}
