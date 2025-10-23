package aula2_comentarios;

//Este código é de abstração
//Demonstra a criação (instanciação) e uso de um objeto da classe Carro.

public class Main {
	
	public static void main(String[] args) {
		
		// Cria um novo objeto da classe Carro chamado "c1"
		// Aqui usamos o operador 'new' para instanciar a classe.
		Carro c1 = new Carro();
		
		// Atribuição dos valores aos atributos do objeto
		// Cada linha define uma característica específica do carro criado.
		c1.marca = "Pulse";      // Marca do carro
		c1.modelo = "Fiat";      // Modelo do carro
		c1.preco = 12000;        // Preço em reais (valor fictício)
		c1.ano = 2024;           // Ano de fabricação
		c1.autonomia = 15;       // Km por litro
		
		// Exibe no console o modelo do carro.
		// 'System.out.println' imprime o valor do atributo modelo do objeto c1.
		System.out.println(c1.modelo);
	}

}
