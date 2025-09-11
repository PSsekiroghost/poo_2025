package arrayList;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("Calculo 1");
		disciplinas.add("Algebra Linear");
		disciplinas.add("Circuitos Eletricos");
		disciplinas.add("Banco de dados 1");
		
		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));
		
		disciplinas.set(3, "Banco de dados 2");
		System.out.println(disciplinas);
		
		disciplinas.remove(0);
		System.out.println(disciplinas);
		
		for(int i = 0; i < disciplinas.size(); i++) {
			
			System.out.println(disciplinas.get(i));
		}
	}

}
