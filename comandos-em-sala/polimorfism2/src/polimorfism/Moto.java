package polimorfism;

public class Moto extends Automovel {
	
	public boolean temBau;
	
	public void temBau(boolean bau) {
		if(bau) {
			System.out.println("Tem Bau");
		}else {
			System.out.println("Não tem Bau");
		}
	}

}
