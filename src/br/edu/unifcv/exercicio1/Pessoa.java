package br.edu.unifcv.exercicio1;

public class Pessoa {
	public int idade;
	public int dia_nascimento;
	public int mes_nascimento;
	public int ano_nascimento;
	public int dia_atual;
	public int mes_atual;
	public int ano_atual;
	public String nome;

	public void calculaIdade() {
		dia_atual = 4;
		mes_atual = 9;
		ano_atual = 2019;
		dia_nascimento = 7;
		mes_nascimento = 2;
		ano_nascimento = 2001;
		if (mes_nascimento < mes_atual || (mes_nascimento == mes_atual && dia_nascimento <= dia_atual))
			idade = ano_atual - ano_nascimento;
		else
			idade = (ano_atual - ano_nascimento) - 1;
	}

	public void informaIdade() {
		System.out.println(idade + " Anos");
	}

	public void informaNome() {
		nome = "Gabriel da Silva";
		System.out.println(nome);
	}

	public void ajustaDataDeNascimento(int dia_nascimento, int mes_nascimento, int ano_nascimento) {
		dia_atual = 4;
		mes_atual = 9;
		ano_atual = 2019;
		if (mes_nascimento < mes_atual || (mes_nascimento == mes_atual && dia_nascimento <= dia_atual))
			idade = ano_atual - ano_nascimento;
		else
			idade = (ano_atual - ano_nascimento) - 1;
	}
}
