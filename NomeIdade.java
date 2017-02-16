package br.unipe.java.unidade1;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		String nome;
		int x;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome = leitor.nextLine();
		System.out.println("Digite a idade: ");
		x = leitor.nextInt();
		System.out.println();
		
		System.out.println(nome + " tem " + x + " anos.");

	}

}
