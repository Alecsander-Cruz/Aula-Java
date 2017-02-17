package br.unipe.java.unidade1;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		
		int atual = 2017;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite a idade: ");
		int idade = leitor.nextInt();
		System.out.println("Digite o seu ano de nascimento: ");
		int nascimento = leitor.nextInt();
		
		
		System.out.println(nome + " tem " + idade + " anos.");
		System.out.println("Ele fará " + (atual - nascimento) + " anos em " + atual + ".");
	}

}