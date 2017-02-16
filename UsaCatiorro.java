package br.unipe.java.unidade1;

import java.util.Scanner;

public class UsaCatiorro {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
				
		Cachorro catiorro = new Cachorro();
		
		System.out.println("Informe o nome do cachorro: ");
		catiorro.nome = leitor.nextLine();
		catiorro.late();

	}

}
