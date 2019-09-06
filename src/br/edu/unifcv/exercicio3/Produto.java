package br.edu.unifcv.exercicio3;

public class Produto {

	private String nome_produto;
	public int quantidade;
	private Double valor;
	
	public Produto(String nome_produto, double valor, int quantidade) {
		this.nome_produto = nome_produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome_produto;
	}
	public void setNome(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
