package aula6_comentarios;

//Este código é de agregação
//Demonstra a criação de objetos Aluno e Endereco separadamente,
//e a posterior associação entre eles.

public class Main {
	
	public static void main(String[] args) {
		
		// Criação de um objeto Aluno
		Aluno a1 = new Aluno();
		a1.setNome("Paulo");
		a1.setRa("12345678");
		
		// Criação de um objeto Endereco separado (independente)
		Endereco e1 = new Endereco();
		e1.setCep("54638-90");
		e1.setLogradouro("Quadra 15");
		e1.setNumero(3);
		
		// Associação entre o aluno e o endereço
		// Aqui ocorre a agregação: o Aluno passa a "ter" um Endereco
		a1.setEndereco(e1);
		
		// Impressão de informações do aluno e do endereço
		System.out.println(a1.getNome() + "-" + a1.getRa() + "-" + a1.getEndereco().getLogradouro());
	}
}
