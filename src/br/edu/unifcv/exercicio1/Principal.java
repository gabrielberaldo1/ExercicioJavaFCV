package br.edu.unifcv.exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.calculaIdade();
		p.informaIdade();
		p.informaNome();
		p.ajustaDataDeNascimento(8, 4, 1999);
		p.informaIdade();
	}

}
