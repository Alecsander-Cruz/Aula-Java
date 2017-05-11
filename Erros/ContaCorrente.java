/**
 *
 * @autor aluno
 * @date 10 de mai de 2017
 * @time 20:56:07
 * $(tags)
 * 
 */
package br.unipe.aula.java;

/**
 * @author aluno
 *
 */
public class ContaCorrente {
	
	private double saldo = 0.0;
	
	public void depositar (double valorDeposito){
		System.out.println("Valor Depositado: " + valorDeposito);
		this.saldo += valorDeposito;
	}
	
	public void sacar (double valorSaque){
		System.out.println("Sacar " + valorSaque);
		this.saldo -= valorSaque;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
