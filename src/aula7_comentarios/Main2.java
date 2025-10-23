package aula7_comentarios;

//Este código é de composição
//Demonstra uma relação onde a Biblioteca já é criada com os livros prontos.
//Os livros passam a fazer parte do ciclo de vida da biblioteca.

import java.util.ArrayList;

public class Main2 {
	
	public static void main(String[] args) {
		
		// Criação dos livros
		Livro l1 = new Livro();
		l1.setAutor("Karlinhos");
		l1.setTitulo("A criação da roda");
		l1.setAnoPublicacao(1998);
		
		Livro l2 = new Livro();
		l2.setAutor("Alegria");
		l2.setTitulo("Ciclo de vida");
		l2.setAnoPublicacao(2000);
		
		// Criação da lista de livros
		ArrayList<Livro> ls = new ArrayList<Livro>();
		ls.add(l1);
		ls.add(l2);
		
		// A biblioteca é criada já com a lista de livros — composição
		Biblioteca b1 = new Biblioteca(ls);
		b1.setNome("nota-10");
		
		// Exibição dos títulos dos livros contidos na biblioteca
		for (Livro livro : b1.getLivros()) {
			System.out.println(livro.getTitulo());
		}
		
		// Aqui temos composição porque a biblioteca "nasce" com os livros integrados.
	}

}
