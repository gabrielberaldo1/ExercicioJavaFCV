package br.edu.unifcv.exercicio3;

public class Principal {

		public static void main(String[] args) {
			
			//Cadastro de Produtos
			Produto produto = new Produto("Refrigerante", 4.00, 1);
			Produto produto2 = new Produto("Fandangos", 5.00, 2);
			
			//Cliente
			Cliente cliente = new Cliente("Gabriel", "Dinheiro");
			
			//Pedido
			Pedido pedido = new Pedido(cliente);
			pedido.addProduto(produto);
			pedido.addProduto(produto2);
			pedido.addProduto(produto2);
			System.out.println("Total da Compra: R$ " + pedido.getValorTotal());
			System.out.println("Forma de pagamento: " + cliente.getPagamento());
			
		}
}
		