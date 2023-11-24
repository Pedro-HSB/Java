package classExtra.funcionario;

//import classExtra.funcionario.*;
public class FuncionarioLogistica extends Funcionario implements usaExcel{
	Funcionario funcionario1 = new FuncionarioRH();
	
	funcionario1.cadastro("fulano");
	funcionario1.cadastro("fulano",20);
	funcionario1.cadastro("fulano",20,"1213654");
	
}
