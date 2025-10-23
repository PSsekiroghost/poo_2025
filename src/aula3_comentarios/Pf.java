package aula3_comentarios;

//Este código é de herança e abstração
//Subclasse (classe filha) que representa uma Pessoa Física.
//Ela herda os atributos da classe Pessoa e adiciona os próprios.


public class Pf extends Pessoa {
	
	// Atributos específicos de uma pessoa física
	public String cpf;   // Cadastro de Pessoa Física
	public int rg;       // Registro Geral (documento de identidade)
	
	// Por herdar de Pessoa, esta classe também possui nome, dataNacs, endereco e telefone.
}