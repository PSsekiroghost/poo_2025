package aula3_comentarios;

//Este código é de herança e abstração
//Subclasse (classe filha) que representa uma Pessoa Jurídica.
//Ela herda os atributos da classe Pessoa e adiciona o CNPJ.


public class Pj extends Pessoa {
	
	// Atributo específico de uma pessoa jurídica
	public String cnpj;  // Cadastro Nacional de Pessoa Jurídica
	
	// Assim como Pf, também herda nome, dataNacs, endereco e telefone de Pessoa.
}