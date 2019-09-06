package br.edu.unifcv.exercicio3;

public class Cliente {

	private String nome_cliente;
	private String forma_pagamento;

	public Cliente(String nome_cliente, String forma_pagamento) {
		this.nome_cliente = nome_cliente;
		this.forma_pagamento = forma_pagamento;
	}

	public String getPagamento() {
		return forma_pagamento;
	}

	public void setPagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getNomeCliente() {
		return nome_cliente;
	}

	public void setNomeCliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
}
