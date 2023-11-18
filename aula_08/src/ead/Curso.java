package ead;

public class Curso {

	private String nome;
	private float preco;
	private String instrutor;
	private String unidade;
	private int vagas;
	
	public Curso(String nome, float preco, String instrutor, String unidade, int vagas) {
		this.nome = nome;
		this.preco = preco;
		this.instrutor = instrutor;
		this.unidade = unidade;
		this.vagas = vagas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	public void visualizar() {
		System.out.println("o instrutor do curso e: " + this.getInstrutor());
		System.out.println("o curso e: " + this.getNome());
		System.out.println("a unidade que possui o curso e: " + this.getUnidade());
		System.out.println("o preco do curso e: "+this.getPreco());
		System.out.println("o numero de vagas e: "+this.getVagas()+"\n");
	
}
}
