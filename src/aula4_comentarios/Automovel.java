package aula4_comentarios;

//Este código é de herança e polimorfismo
//Classe base (superclasse) que representa um automóvel genérico.
//Aplica o conceito de encapsulamento e sobrecarga de métodos (polimorfismo).

public class Automovel {
	
	// Atributos privados (encapsulamento)
	private String marca;   // Marca do automóvel (ex: Fiat, VW)
	private String modelo;  // Modelo do automóvel (ex: Pulse, Nivus)
	private int ano;        // Ano de fabricação
	
	// Métodos de acesso (getters e setters)
	// Permitem acessar e modificar os atributos de forma controlada.
	
	
	public String getMarca() {
		return marca; // Retorna a marca armazenada
	}
	
	public void setMarca(String marca) {
		this.marca = marca; // Define a marca
	}
	
	public String getModelo() {
		// Retorna o modelo sempre em letras maiúsculas
			// Demonstra que o getter pode realizar uma ação extra antes de devolver o valor
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
		
	
	// Método comum (sem parâmetros)
	public void ligar() {
		System.out.println("Automovel ligado!");
	}
	
	// Sobrecarga de método (polimorfismo de compilação)
	// Mesmo nome do método "ligar", mas com parâmetro diferente.
	
	public void ligar(boolean usouAfogador) {
		if(usouAfogador) {
			System.out.println("Automovel ligado!");
		} else {
			System.out.println("Automovel afogado!");
		}
	}
}
