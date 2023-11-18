package games;

public class Produto {
	
	private String nome;
	private float preco;
	private int quantidade;
	private String descricao;
	private String estado;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Produto(String nome, float preco, int quantidade, String descricao, String estado) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.estado = estado;
	}
	
	public void visualizar() {
		System.out.println("o nome dop jogo e: "+ getNome());
		System.out.println("o preco do jogo e: "+getPreco());
		System.out.println("qual quantidade deseja levar: "+getQuantidade());
		System.out.println("descricao sobre o jogo: "+getDescricao());
		System.out.println("o estado de conservacao e: "+getEstado());
		System.out.println("o preco final ficou: "+(getPreco()*getQuantidade())+"\n");
	}
	
}
