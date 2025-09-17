package arraylist_ex;

import java.util.ArrayList;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Paulo");
		nome.add("João");
		nome.add("Ana");
		nome.add("Maria");
		nome.add("Mariana");
		nome.add("Gabi");
		nome.add("Karlos");
		nome.add("Marcos");
		
		System.out.println("Primeira lista: " + nome);
		System.out.println("Nomes com iniciais - M: " + novoArray(nome));
	}
	
	public static ArrayList<String> novoArray(ArrayList<String> nomes){
		
		ArrayList<String> resultado = new ArrayList<String>();
		for(String i : nomes) {
			if(i.startsWith("M")) {
				resultado.add(i);
			}
		}
		return resultado;
	}

}
