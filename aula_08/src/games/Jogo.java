package games;

public class Jogo extends Produto{

	private String categoria;
	public Jogo(String nome, float preco, int quantidade, String descricao, String estado,String categoria) {
		super(nome, preco, quantidade, descricao, estado);
		// TODO Auto-generated constructor stub
		
		this.categoria=categoria;
	}

	public void visualizar() {
		System.out.println("o nome dop jogo e: "+ getNome());
		System.out.println("o preco do jogo e: "+getPreco());
		System.out.println("qual quantidade deseja levar: "+getQuantidade());
		System.out.println("descricao sobre o jogo: "+getDescricao());
		System.out.println("o estado de conservacao e: "+getEstado());
		System.out.println("a categoria do jogo e: "+getCategoria());
		System.out.println("o preco final ficou: "+(getPreco()*getQuantidade())+"\n");
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
