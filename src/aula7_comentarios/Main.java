package aula7_comentarios;

//Este código é de agregação
//Demonstra a relação onde a Biblioteca e os Livros existem separadamente.
//Os livros são criados fora da classe Biblioteca e depois associados a ela.

public class Main {
	
	public static void main(String[] args) {
		
		// Criação de dois objetos Livro
		Livro l1 = new Livro();
		l1.setAutor("Karlinhos");
		l1.setTitulo("A criação da roda");
		l1.setAnoPublicacao(1998);
		
		Livro l2 = new Livro();
		l2.setAutor("Alegria");
		l2.setTitulo("Ciclo de vida");
		l2.setAnoPublicacao(2000);
		
		// Criação da biblioteca vazia
		Biblioteca b1 = new Biblioteca();
		b1.setNome("nota-10");
		
		// Associação: os livros são adicionados depois de criados
		b1.getLivros().add(l1);
		b1.getLivros().add(l2);
		
		// Exibição dos títulos dos livros da biblioteca
		for (Livro livro : b1.getLivros()) {
			System.out.println(livro.getTitulo());
		}
		
		// Aqui temos agregação porque os livros existem fora da biblioteca.
	}

}
