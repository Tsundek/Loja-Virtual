package br.com.fatec.Principal;

import javax.swing.JOptionPane;

import br.com.fatec.Parametros.Loja;

public class Principal {
	
	public static void main(String[] args) {
		Loja p = new Loja();
		
		int e=0;
		do {
			e=p.Menu();
			if(e==1) {
				p.cadastrarProduto();
			}else if(e==2) {
				p.inserirDesconto();
			}else if(e==3) {
				p.MostrarConta();
			}else if(e==4)
			{
				JOptionPane.showMessageDialog(null, "Obrigado por usar!!!");
				System.exit(0);
			}
			e=0;
		}while(e!=4);
	}
}
