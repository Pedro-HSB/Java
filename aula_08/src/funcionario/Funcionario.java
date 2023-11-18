package funcionario;

public class Funcionario {

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
	public void visualisa() {
		System.out.println("seu nome e: " + this.nome);
		if (this.getCarteiraTrabalho()==true) 
			System.out.println("possui carteira de trabalho : Sim");
		
		else
			System.out.println("possui carteira de trabalho : Nao");
		System.out.println("sua etnia e: " + this.getEtnia());
		System.out.println("seu salario e: "+this.getSalario());
		System.out.println("seu setor e: "+this.getSetor()+"\n");
	}
}
