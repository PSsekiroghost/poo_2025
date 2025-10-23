package aula6_comentarios;

//Este código é de agregação
//Representa o endereço de um aluno.
//Será usado dentro da classe Aluno, mostrando a relação de agregação.

public class Endereco {
	
	// Atributos privados (encapsulamento)
	private String cep;         // Código de endereçamento postal
	private String logradouro;  // Nome da rua, quadra, avenida etc.
	private int numero;         // Número da residência
	
	
	// Métodos de acesso (getters e setters)
	// Permitem ler e alterar os atributos de forma controlada.
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Métodos de acesso (getters e setters)
	// Permitem ler e alterar os atributos de forma controlada.
}
