package arraylist_ex;

import java.util.ArrayList;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> linguas = new ArrayList<String>();
		linguas.add("Portugues");
		linguas.add("Ingles");
		linguas.add("Mandarim");
		linguas.add("Japones");
		
		System.out.println("Tamanho da lista: " + linguas.size());
		System.out.println("Verificação(Mandarim): " + linguas.contains("Mandarim"));
		System.out.println("Verificação(Latim): " + linguas.contains("Latim"));
	}

}
