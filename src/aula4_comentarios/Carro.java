package aula4_comentarios;

//Este código é de herança e polimorfismo
//Subclasse (classe filha) que herda de Automovel.
//Apresenta polimorfismo por sobreposição (override) do método ligar().


public class Carro extends Automovel {
	
	// Atributo adicional específico do carro
	public boolean temArcondicionado; // Indica se o carro possui ar-condicionado
	
	// Sobrescrita de método (polimorfismo de execução)
	// Este método substitui o comportamento original do método "ligar" da classe Automovel.
	@Override
	public void ligar() {
		super.ligar(); // Chama o método da classe pai antes de executar o novo comportamento
		System.out.println("Carro ligado!!"); // Comportamento adicional específico do Carro
	}
}
