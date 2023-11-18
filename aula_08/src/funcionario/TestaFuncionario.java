package funcionario;

import funcionario.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario fun1 = new Funcionario(true,"cleito","desenvolvimento",1800.00f,"preta");
		Funcionario fun2 = new Funcionario(false,"cleitin","RH",2000.00f,"preta");
		Funcionario fun3 = new Funcionario(true,"cleitao","portaria",3000.00f,"preta");
		
		fun1.visualisa();
		fun2.visualisa();
		fun3.visualisa();
	}

}
