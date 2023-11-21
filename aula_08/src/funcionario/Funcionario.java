package funcionario;

public abstract class Funcionario {

	private boolean carteiraTrabalho;
	private String nome;
	private String setor;
	private float salario;
	private String etnia;
	
	
	public boolean getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(boolean carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getEtnia() {
		return etnia;
	}
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}
	
	public Funcionario(boolean carteiraTrabalho, String nome, String setor, float salario, String etnia) {
		super();
		this.carteiraTrabalho = carteiraTrabalho;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.etnia = etnia;
	}
}
