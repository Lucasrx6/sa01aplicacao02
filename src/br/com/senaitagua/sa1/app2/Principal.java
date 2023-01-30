package br.com.senaitagua.sa1.app2;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lancamento;
		int atual = 2023;
		
		lancamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do de lançamento do primeiro avião da EMBRAER"));

		if(lancamento <= 1920){
			JOptionPane.showMessageDialog(null, "Ano incorreto");
		}
		else if (lancamento > 2022) {
			JOptionPane.showMessageDialog(null, "Ano incorreto");
		}
		
		CalculoBO cbo = new CalculoBO();
		
		int idade = cbo.subtrai(atual,lancamento);
		
		JOptionPane.showMessageDialog(null, "A idade do avião é "+ idade +" anos");
		
	}

}