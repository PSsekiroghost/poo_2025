package arraylist_ex;

import java.util.ArrayList;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(54);
		num.add(14);
		num.add(20);
		num.add(6);
		num.add(10);
		
		int menorIndice = 0;
		
		for (int i = 1; i < num.size(); i++) {
			if(num.get(i) < num.get(menorIndice)) {
				menorIndice = i;
			}
		}
		
		System.out.println("Lista : " + num);
		System.out.println("O menor indice : " + num.get(menorIndice));
		
		
	}
	
	

}
