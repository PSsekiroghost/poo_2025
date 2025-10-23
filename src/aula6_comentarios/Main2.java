package aula6_comentarios;

//Este código é de agregação
//Mostra outro exemplo de associação entre Aluno e Endereco,
//agora utilizando o construtor com parâmetros.


public class Main2 {
	
	public static void main(String[] args) {
		
		// Criação de um objeto Endereco (independente)
		Endereco e2 = new Endereco();
		e2.setCep("66836597");
		e2.setLogradouro("Quadra 13");
		e2.setNumero(100);
		
		// Criação de um aluno usando o construtor que recebe nome e endereço
		String nome = "Karlos";
		Aluno a2 = new Aluno(nome, e2);
		
		// Exibição dos dados
		System.out.println(a2.getNome());                     // Nome do aluno
		System.out.println(a2.getEndereco().getLogradouro()); // Logradouro do endereço associado
		System.out.println(a2.getRa());                       // RA ainda não definido (null)
	}

}
