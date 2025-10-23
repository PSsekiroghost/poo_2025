package aula5_comentarios;

//Este código é de ArrayList
//Demonstra como criar, manipular e percorrer uma lista dinâmica em Java.

import java.util.ArrayList; // Importa a classe ArrayList da biblioteca Java

public class Main {
	
	public static void main(String[] args) {
		
		// Criação de um ArrayList que armazena Strings (nomes de disciplinas)
		ArrayList<String> disciplinas = new ArrayList<String>();
		
		// Adicionando elementos à lista com o método add()
		disciplinas.add("Cálculo II");
		disciplinas.add("Álgebra Linear");
		disciplinas.add("Circuitos Elétricos");
		disciplinas.add("Cálculo III");
		
		// Exibe todos os elementos da lista (imprime o ArrayList completo)
		System.out.println(disciplinas);
		// Saída: [Cálculo II, Álgebra Linear, Circuitos Elétricos, Cálculo III]
		
		// Acessando um elemento específico pelo índice (posição)
		System.out.println(disciplinas.get(2)); 
		// Índice 2 = terceiro elemento -> "Circuitos Elétricos"
		
		// Alterando um elemento da lista usando set(posição, novoValor)
		disciplinas.set(3, "Cálculo IV"); 
		// Substitui o item na posição 3 ("Cálculo III") por "Cálculo IV"
		
		// Exibe novamente a lista atualizada
		System.out.println(disciplinas);
		// Saída: [Cálculo II, Álgebra Linear, Circuitos Elétricos, Cálculo IV]
		
		// Percorrendo a lista usando um laço for tradicional
		for(int i = 0; i < disciplinas.size(); i++) {
			// get(i) retorna o elemento da posição i
			System.out.println(disciplinas.get(i));
		}
		
		// Observações:
		// - size() retorna o número de elementos na lista.
		// - O índice do primeiro elemento é 0.
		// - ArrayList pode crescer dinamicamente conforme adicionamos itens.
	}

}
