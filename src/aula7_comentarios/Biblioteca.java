package aula7_comentarios;

//Este código é de agregação e composição
//A classe Biblioteca mantém uma relação com a classe Livro.
//Pode representar tanto agregação (quando os livros são adicionados depois)
//quanto composição (quando os livros são passados no construtor).

import java.util.ArrayList;

public class Biblioteca {
	
	// Construtor vazio → usado no caso de agregação (Main.java)
	public Biblioteca() { 
		
	}
	
	public Biblioteca(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	// Atributos privados
	private String nome;                          // Nome da biblioteca
	private ArrayList<Livro> livros = new ArrayList<Livro>(); // Lista de livros da biblioteca
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
}
