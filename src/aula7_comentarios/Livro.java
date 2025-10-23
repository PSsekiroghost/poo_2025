package aula7_comentarios;

//Este código é de agregação e composição
//Representa a classe Livro, que será usada em ambos os exemplos (agregação e composição).

public class Livro {
	
	// Atributos privados (encapsulamento)
	private String titulo;         // Título do livro
	private String autor;          // Autor do livro
	private int anoPublicacao;     // Ano em que o livro foi publicado
	
	// Métodos de acesso (getters e setters)
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
