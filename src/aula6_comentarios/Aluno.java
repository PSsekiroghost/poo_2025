package aula6_comentarios;

//Este código é de agregação
//A classe Aluno possui um objeto Endereco, mas o endereço é criado fora dela.
//Isso caracteriza uma relação de AGREGAR (Aluno "tem um" Endereco).

public class Aluno {
	
	// Atributos privados (encapsulamento)
	private String nome;         // Nome do aluno
	private String ra;           // Registro acadêmico do aluno
	private Endereco endereco;   // Associação com a classe Endereco (agregação)
	
	// Construtor padrão (sem parâmetros)
	public Aluno() {
		// Pode ser usado para criar o objeto e depois definir valores com setters.
	}
	
	// Construtor com parâmetros (sobrecarga)
	// Recebe um nome e um endereço já criado e associa ao aluno.
	public Aluno(String nome, Endereco endereco){
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
