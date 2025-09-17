package arraylist_ex;

import java.util.ArrayList;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(25);
		lista1.add(13);
		lista1.add(10);
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(10);
		lista2.add(30);
		lista2.add(100);
		lista2.add(25);
		
		System.out.println("Lista 1: " + lista1);
		System.out.println("Lista 2: " + lista2);
		System.out.println("Junção das listas com elementos unicos: " + juntarListas(lista1, lista2));
		
	}
	
	public static ArrayList<Integer> juntarListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (Integer i : lista1) {
			if(!lista2.contains(i)) {
				resultado.add(i);
			}
		}
		for (Integer j : lista2) {
			if(!lista1.contains(j)) {
				resultado.add(j);
			}
		}
		return resultado;
	}

}
