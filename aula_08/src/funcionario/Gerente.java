package funcionario;

public class Gerente extends Funcionario{

	public Gerente(boolean carteiraTrabalho, String nome, String setor, float salario, String etnia) {
		super(carteiraTrabalho, nome, setor, salario, etnia);
		// TODO Auto-generated constructor stub
	}
	
	public void visualisa() {
		System.out.println("seu nome e: " + this.getNome());
		if (this.getCarteiraTrabalho()==true) 
			System.out.println("possui carteira de trabalho : Sim");
		
		else
			System.out.println("possui carteira de trabalho : Nao");
		System.out.println("sua etnia e: " + this.getEtnia());
		System.out.println("seu salario e: "+this.getSalario());
		System.out.println("seu setor e: "+this.getSetor()+"\n");
	}

}
