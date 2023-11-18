package farmacia;

import farmacia.Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Farmacia farmacia1 = new Farmacia("creme","rua das ruas","cleitin",41236.654896f,"farmacia das farmacia");
		Farmacia farmacia2 = new Farmacia("escova","rua das farmacia","cleisto",41236.654896f,"farmacia e farmacia");
		Farmacia farmacia3 = new Farmacia("pasta de dente","rua dos hospital","cleivaldo",41236.654896f,"farmacia de farmacia");
		
		farmacia1.visualizar();
		farmacia2.visualizar();
		farmacia3.visualizar();
	}

}
