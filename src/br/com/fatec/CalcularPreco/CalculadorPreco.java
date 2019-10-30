package br.com.fatec.CalcularPreco;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import br.com.fatec.Desconto.DescontoFixo;
import br.com.fatec.Desconto.DescontoPorcentagem;
import br.com.fatec.Desconto.ICalculo;
import br.com.fatec.Desconto.SemDesconto;

public class CalculadorPreco{

	ICalculo calculo;
	public ICalculo ChamarDesconto(ICalculo c) 
	{
		int r = 0;
		do {
		try {
			r = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de desconto deseja?"
				+ "\n"
				+ "1 - Preço fixo"
				+ "\n"
				+ "2 - Porcentagem"
				+ "\n"
				+ "3 - Sem desconto"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}while(r<=0||r>3);
		if(r==1) 
			c= new DescontoFixo();
		else if(r==2)
			c= new DescontoPorcentagem();
		else if(r==3) {
			c=new SemDesconto();
			calculo.inserirDesconto(0);
			}
		return c;
	}
	
	public void aplicarDesconto() 
	{
		
		double desconto = 0;
		if(!((calculo= ChamarDesconto(calculo)) instanceof SemDesconto)) {
			desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto: "));
		}
		calculo.inserirDesconto(desconto);

		
	}
	
	public double calcularDesconto(double a) 
	{
		return calculo.calcular(a);
	}
	

}