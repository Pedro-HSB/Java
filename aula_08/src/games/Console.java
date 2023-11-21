package games;

public class Console extends Produto{

	private String tipo;
	public Console(String nome, float preco, int quantidade, String descricao, String estado,String tipo) {
		super(nome, preco, quantidade, descricao, estado);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		System.out.println("o nome dop jogo e: "+ getNome());
		System.out.println("o preco do jogo e: "+getPreco());
		System.out.println("qual quantidade deseja levar: "+getQuantidade());
		System.out.println("descricao sobre o jogo: "+getDescricao());
		System.out.println("o estado de conservacao e: "+getEstado());
		System.out.println("o console e do tipo: "+getTipo());
		System.out.println("o preco final ficou: "+(getPreco()*getQuantidade())+"\n");
	}
}
