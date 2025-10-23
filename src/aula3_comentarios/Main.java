package aula3_comentarios;

//Este código é de herança e abstração
//Demonstra o uso das classes Pessoa, Pf e Pj,
//mostrando a reutilização de código e o conceito de herança.


public class Main {
	
	public static void main(String[] args) {
		
		// Criação de um objeto da classe Pf (Pessoa Física)
		Pf pf1 = new Pf();
		pf1.cpf = "053456277890";             // CPF específico da pessoa física
		pf1.rg = 12345678;                    // RG
		pf1.endereco = "Quadra 100 lote 5";   // Atributo herdado de Pessoa
		pf1.nome = "Paulo";                   // Atributo herdado de Pessoa
		pf1.dataNacs = "08/08/2006";          // Atributo herdado de Pessoa
		pf1.telefone = "61 99765-6564";       // Atributo herdado de Pessoa
		
		// Criação de um objeto da classe Pj (Pessoa Jurídica)
		Pj pj1 = new Pj();
		pj1.cnpj = "2435679812";              // Atributo específico da pessoa jurídica
		pj1.endereco = "Qudra 5 lote 1";      // Atributo herdado de Pessoa
		
		// Impressão de alguns atributos para verificar o funcionamento
		System.out.println(pf1.cpf);          // Exibe o CPF da pessoa física
		System.out.println(pj1.endereco);     // Exibe o endereço da pessoa jurídica
	}

}
