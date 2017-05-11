/**
 *
 * @autor aluno
 * @date 10 de mai de 2017
 * @time 21:04:56
 * ${tags}
 * 
 */
package br.unipe.aula.java;

class PrincipalContaCorrente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Agencia agencia = new Agencia();
		ContaCorrente conta = null;
		
		agencia.cadastrarConta(conta);
		try {
			agencia.consultarConta(conta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Opa, estou rico!");

	}

}
