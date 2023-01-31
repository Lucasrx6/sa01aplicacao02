# Atividade Aula Java SENAI 
## sa01aplicacao2


Este programa tem a finalidade de resolver a segunda atividade da lista de exercicios


2 - (vai diminuir o ano atual com o ano de lançamento do primeiro avião da Embraer))

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215862777-9a791509-d913-4f95-a70c-aa4c55ae954c.PNG)


Resultado


![print2](https://user-images.githubusercontent.com/86980974/215862805-f12081bc-1249-4eef-9405-fa1d445ac844.PNG)


----------------------------------------------------------------------------------

Código da classe principal

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
    
----------------------------------------------------------------------------------

Código da classe CalculaBO

package br.com.senaitagua.sa1.bo;
import javax.swing.JOptionPane;
public class CalculoBO {

	public int subtrai(int lancamento, int atual) {
		return atual-lancamento;
    
	}
}
