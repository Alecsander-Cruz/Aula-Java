package br.unipe.java.unidade1;

import java.util.Scanner;

public class DescobrirIdade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int nascimento, atual;
		
		System.out.println("Digite o ano em que estamos: ");
		atual = leitor.nextInt();
		System.out.println("Digite o seu ano de nascimento: ");
		nascimento = leitor.nextInt();
		System.out.println();
		
		System.out.println("Você fará " + (atual - nascimento) + " anos em " + atual + ".");

	}

}
