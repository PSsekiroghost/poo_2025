package exercicio4_agregacao_composicao;

//Este código é de composição
//Demonstra a criação de um Pedido composto por vários Itens,
//onde cada ItemPedido contém um Produto.

import java.util.ArrayList;

//composição

public class Main {
	
	public static void main(String[] args) {
		
		// Criação dos produtos
		Produto p1 = new Produto();
		p1.setNome("Morango");
		p1.setPreco(10.99);
		
		Produto p2 = new Produto();
		p2.setNome("Laranja");
		p2.setPreco(5.99);
		
		// Criação dos itens do pedido
		ItemPedido ip1 = new ItemPedido();
		ip1.setQtd(2);
		ip1.setProduto(p1);
		
		ItemPedido ip2 = new ItemPedido();
		ip2.setQtd(7);
		ip2.setProduto(p2);
		
		// Criação da lista de itens
		ArrayList<ItemPedido> lista = new ArrayList<ItemPedido>();
		lista.add(ip1);
		lista.add(ip2);
		
		// Criação do pedido (composição: pedido "tem" os itens)
		Pedido pedido = new Pedido(lista);
		
		// Exibição do valor total do pedido
		System.out.println("Valor total do pedido: R$ " + pedido.getTotal());
	}
}

