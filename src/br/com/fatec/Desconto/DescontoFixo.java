package br.com.fatec.Desconto;

public class DescontoFixo implements ICalculo{

	private double valorDescontoFixo;
	@Override
	public double calcular(double a) {
		double r;
		r = a-valorDescontoFixo;
		a = a-r;
		if(a<=0) 
			a*=-1;
		
		return r;
	}
	@Override
	public void inserirDesconto(double b) {
		// TODO Auto-generated method stub
		this.valorDescontoFixo = b;
	}

}
