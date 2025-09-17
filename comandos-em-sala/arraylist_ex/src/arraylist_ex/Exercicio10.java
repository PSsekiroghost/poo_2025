package arraylist_ex;

import java.util.ArrayList;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		ArrayList<String> jogos = new ArrayList<String>();
		jogos.add("Pokemon");
		jogos.add("Elder ring");
		jogos.add("Mario");
		jogos.add("Silksong");
		jogos.add("Fifa");
		
		
		System.out.println("Array normal: " + jogos);
		System.out.println("Array reversa: " + reversa(jogos));	
	}
	
	public static ArrayList<String> reversa(ArrayList<String> reversoJogos){
		
		ArrayList<String> resultado = new ArrayList<String>();
		for(int i = reversoJogos.size() - 1; i >= 0; i--) {
			resultado.add(reversoJogos.get(i));
		}
		return resultado;
	}
	
}
