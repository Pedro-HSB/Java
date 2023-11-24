package classExtra.aves;

public class Aguia implements PodeVoar{

	public float tamanho;
	public String cor;
	
	@Override
	public void voa() {
		System.out.println("a aguia voou");
	}
}
