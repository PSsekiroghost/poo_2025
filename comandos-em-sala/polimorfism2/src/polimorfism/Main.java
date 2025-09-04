package polimorfism;

public class Main {
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "Fiat";
		c1.modelo = "Pulse";
		c1.ano = 2026;
		c1.ligar(true);
		c1.temArcondicionado(false);
		
		Moto m1 = new Moto();
		m1.marca = "karlos";
		m1.modelo = "sla";
		m1.ano = 2023;
		m1.ligar(false);
		m1.temBau(true);
	}

}
