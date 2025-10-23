package exercicio4_agregacao_composicao;

//Este código é de composição
//Cada ItemPedido pertence a um Pedido e contém um Produto.
//Um ItemPedido só faz sentido dentro de um Pedido → COMPOSIÇÃO.

public class ItemPedido {
	
	private Produto produto;
	private int qtd;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	// Método para calcular o subtotal deste item (preço x quantidade)
	public double getSubtotal() {
		return produto.getPreco() * qtd;
	}
}

