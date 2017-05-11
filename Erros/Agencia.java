/**
 *
 * @autor aluno
 * @date 10 de mai de 2017
 * @time 21:04:56
 * ${tags}
 * 
 */
package br.unipe.aula.java;

public class Agencia {

	public void cadastrarConta(ContaCorrente conta)throws NullPointerException{
		
		try{
		if(conta.getSaldo()<0)
			System.out.println("Sem Saldo!");
		else
			System.out.println("Conta cadastrada!");
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Conta nula!");
		}catch(Exception oe){
			System.out.println("Outro errro!");
		}
	}
	
	public void consultarConta(ContaCorrente conta)throws Exception{
		if(conta.getSaldo()<0){
			System.out.println("Esta liso ");
		}else{
			System.out.println("Cliente");
		}	
	}	
}