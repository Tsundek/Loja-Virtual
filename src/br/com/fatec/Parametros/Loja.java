package br.com.fatec.Parametros;

import javax.swing.JOptionPane;

import br.com.fatec.CalcularPreco.CalculadorPreco;
import br.com.fatec.Produto.Produto;

public class Loja{
	Produto produto;
	CalculadorPreco preco;
	
	public Loja() 
	{
		preco = new CalculadorPreco();
	}
	
	public int Menu() 
	{
		int resposta = 0;
		try{
			resposta= Integer.parseInt(JOptionPane.showInputDialog("Digite: "
						+ "\n1 - Escolher produto: "
						+ "\n2 - Aplicar desconto: "
						+ "\n3 - Mostrar conta: "
						+ "\n4 - Finalizar: "));
				}
		catch (Exception e) {
			Menu();
		}
		return resposta;
	}
	
	public void cadastrarProduto()
	{
		String nome;
		double valor=0;
		try {
			nome=JOptionPane.showInputDialog("Escreva o nome do produto:");
			valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
			produto= new Produto(nome, valor);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Erro de cadastramentro","Cadastre novamente",1);
			cadastrarProduto();
		}
	}
	
	public void inserirDesconto() 
	{
		preco.aplicarDesconto();
	}
	
	public void MostrarConta() 
	{
		try {
			JOptionPane.showMessageDialog(null, ("Nome do produto: "+produto.getNome()+""
					+ "\nPreço final: R$"
					+ preco.calcularDesconto(produto.getValor())
					+"\n"));
		} catch (Exception e) {
			System.err.println("Erro "+e.getMessage());
			Menu();
		}
	}
	

}
