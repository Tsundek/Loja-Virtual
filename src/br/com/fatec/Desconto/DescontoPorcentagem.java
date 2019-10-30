package br.com.fatec.Desconto;

public class DescontoPorcentagem implements ICalculo {
	
	private double valorDescontoPorcentagem;
	@Override
	public double calcular(double a) {
		double r;
		valorDescontoPorcentagem /= 100;
		r = valorDescontoPorcentagem*a;
		a = a-r;
		if(a<0)
			a*=-1;
		return a;
		
	}

	@Override
	public void inserirDesconto(double b) {
		this.valorDescontoPorcentagem = b;
		
	}

}
