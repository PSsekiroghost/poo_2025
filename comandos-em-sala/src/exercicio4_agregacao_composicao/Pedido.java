package exercicio4_agregacao_composicao;

//Este código é de composição
//Representa um pedido composto por vários itens.
//O Pedido é responsável por "conter" os ItemPedido (composição).

import java.util.ArrayList;

public class Pedido {
	
	// Lista de itens do pedido
	private ArrayList<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();
	
	// Construtor padrão (pedido vazio)
	public Pedido() {
		
	}
	
	// Construtor que já recebe os itens do pedido (composição)
	public Pedido(ArrayList<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
	
	// Métodos de acesso
	public ArrayList<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}
	
	public void setItensPedidos(ArrayList<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
	
	// Calcula o valor total do pedido (somando os subtotais dos itens)
	public double getTotal() {
		double total = 0;
		for(ItemPedido item : itensPedidos) {
			total += item.getSubtotal();
		}
		return total;
	}
	
}
