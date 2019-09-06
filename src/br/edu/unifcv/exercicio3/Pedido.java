package br.edu.unifcv.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();
	private double Valortotal;

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return Valortotal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
		this.Valortotal += produto.getValor();

	}

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}