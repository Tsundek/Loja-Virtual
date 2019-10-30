package br.com.fatec.Produto;

public class Produto {
	protected String nome;
	protected double valor;
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}	
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
}
