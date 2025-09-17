package arraylist_ex;

import java.util.ArrayList;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(15);
		num.add(24);
		num.add(90);
		num.add(12);
		num.add(13);
		num.add(97);
		num.add(9);
		num.add(10);
		
		System.out.println("Lista sem numeros pares: " + semPares(num));
	}
	
	private static ArrayList<Integer> semPares(ArrayList<Integer> num){
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(Integer i : num) {
			if(i % 2 != 0) {
				resultado.add(i);
			}
		}
		return resultado;
	}

}
