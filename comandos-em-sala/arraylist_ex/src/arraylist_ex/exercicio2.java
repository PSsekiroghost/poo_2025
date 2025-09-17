package arraylist_ex;

import java.util.ArrayList;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(10);
		numeros.add(7);
		numeros.add(7);
		
		ArrayList<Integer> unicos = new ArrayList<Integer>();
		for (Integer i : numeros) {
			if(!unicos.contains(i)) {
				unicos.add(i);
			}
		}
		
		System.out.println(numeros);
		System.out.println("Elementos unicos: " + unicos.size());

	}

}
