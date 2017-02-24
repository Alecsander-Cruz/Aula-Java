package br.unipe.java.unidadeI;

import javax.swing.JOptionPane;

public class Menu {
	
	ContaCorrente conta1 = new ContaCorrente();
	
	public String menuPrincipal(){

		String menu = "1 - Sacar \n";
		menu += "2 - Depositar \n";
		menu += "3 - Exibir Saldo \n";
		menu += "4 - Sair \n";
		
		String retorno = JOptionPane.showInputDialog(menu);
		
		return retorno;
	}
	
	public String inputValor(){

		String texto = "Informe o valor a ser sacado: ";
		String valor = JOptionPane.showInputDialog(texto);
		
		return valor;
	}
	
	public String valorDepositar(){

		String texto = "Informe o valor a ser depositado: ";
		String valor = JOptionPane.showInputDialog(texto);
		
		return valor;
	}
	
	public void exibirSaldo(){

		/**
		 * fazer essa disgrama
		 */
		String texto = "Seu saldo é:  ";
		String valor = JOptionPane.showInputDialog(texto + conta1.getSaldo());
		
	}
	
	
}