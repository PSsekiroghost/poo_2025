package aula4_comentarios;

//Este código é de herança e polimorfismo
//Demonstra a criação de objetos de subclasses que herdam de Automovel
//e o uso de getters/setters e métodos sobrescritos.


public class Main {
	
	public static void main(String[] args) {
		
		// Criação do primeiro objeto Carro
		Carro c1 = new Carro();
		c1.setMarca("Fiat");
		c1.setModelo("Pulse");
		c1.setAno(2026);
		
		// Criação do segundo objeto Carro
		Carro c2 = new Carro();
		c2.setMarca("VW");
		c2.setModelo("Nivus");
		c2.setAno(2025);
		
		// Exibição dos modelos (getModelo transforma em maiúsculas)
		System.out.println(c1.getModelo()); // Exibe "PULSE"
		System.out.println(c2.getModelo()); // Exibe "NIVUS"
		
		// Poderíamos testar também o polimorfismo:
		// c1.ligar(); -> usa o método sobrescrito na classe Carro
		// c1.ligar(true); -> usa o método sobrecarregado da superclasse Automovel
	}

}
