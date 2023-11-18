package ead;

import ead.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso("java",41.96f,"cleitin","roxo",100);
		Curso curso2 = new Curso("javascript",412.96f,"cleivaldo","azul",50);
		Curso curso3 = new Curso("C++",41.96f,"cliovaldo","capital",75);
		
		curso1.visualizar();
		curso2.visualizar();
		curso3.visualizar();
		
	}

}
