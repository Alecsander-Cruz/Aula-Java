package br.unipe.java.unidade1;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);		
		
		System.out.println("Digite um número para ser testado: ");
		int z = leitor.nextInt();
		
		if (z == 10){
			System.out.println("z é igual a 10 :)");
		}else{
			System.out.println("z não é igual a 10");
		}

	}

}
