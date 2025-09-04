package polimorfism;

public class Carro extends Automovel {
	
	public boolean temArcondicionado;
	
	public void temArcondicionado(boolean arcondicionado) {
		if(arcondicionado) {
			System.out.println("Tem Arcondicionado");
		}else {
			System.out.println("Não tem Arcondicionado");
		}
	}

}
