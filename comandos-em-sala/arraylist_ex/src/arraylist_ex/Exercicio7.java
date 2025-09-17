package arraylist_ex;

import java.util.ArrayList;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("Paulo", 19));
		lista.add(new Pessoa("Maria", 25));
		lista.add(new Pessoa("Karlos", 31));
		
		for(Pessoa p : lista) {
			System.out.println(p.nome + "-" + p.idade);
		}
	}

}
