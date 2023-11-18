package show;

public class Ingresso {

	private String comprador;
	private float preco;
	private String evento;
	private String destino;
	private String data;
	
	
	
	public String getComprador() {
		return comprador;
	}



	public void setComprador(String comprador) {
		this.comprador = comprador;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public String getEvento() {
		return evento;
	}



	public void setEvento(String evento) {
		this.evento = evento;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}

	public Ingresso(String comprador, float preco, String evento, String destino, String data) {
		this.comprador = comprador;
		this.preco = preco;
		this.evento = evento;
		this.destino = destino;
		this.data = data;
	}



	public void visualizar() {
		System.out.println("seu nome do comprador e: " + this.getComprador());
		System.out.println("seu destino e: " + this.getDestino());
		System.out.println("seu ingresso e do evento e: " + this.getEvento());
		System.out.println("o preco do ingresso e: "+this.getPreco());
		System.out.println("o a data do evento e: "+this.getData()+"\n");
	
}
}
