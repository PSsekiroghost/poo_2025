package arraylist_ex;

import java.util.ArrayList;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> comida = new ArrayList<String>();
		comida.add("Açai");
		comida.add("Maça");
		comida.add("Açai");
		comida.add("Arroz");
		comida.add("Feijão");
		comida.add("Arroz");
		comida.add("Açai");
		
		String procurar = "Açai";
		int contador = 0;
		
		for(String i : comida ) {
			if(i.equals(procurar)) {
				contador++;
			}
		}
		
		System.out.println("A comida " + procurar + " aparece " + contador + " vezes");
		
	}

}
