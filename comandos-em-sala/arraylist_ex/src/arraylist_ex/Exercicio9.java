package arraylist_ex;

import java.util.ArrayList;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(15);
		lista.add(12);
		lista.add(23);
		lista.add(25);
		lista.add(10);
		lista.add(5);
		lista.add(1);
		lista.add(57);
		
		int soma = 0;
		for(int i : lista) {
			soma += i;
		}
		
		float media = soma / lista.size();
		System.out.println("A media é: " + media);
		
	}

}
