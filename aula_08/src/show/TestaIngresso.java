package show;

import show.Ingresso;
public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingresso show1 = new Ingresso("cleitin",41.96f,"o mais zika","rua das ruas","14/11/2025");
		Ingresso show2 = new Ingresso("cleisto",412.96f,"o menos zika","rua das farmacia","20/10/2025");
		Ingresso show3 = new Ingresso("cleivaldo",41.96f,"o mais ou menos","rua dos hospital","10/12/2025");
		
		show1.visualizar();
		show2.visualizar();
		show3.visualizar();
		
	}

}
