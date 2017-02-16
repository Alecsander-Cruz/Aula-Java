package br.unipe.java.unidade1;

import java.util.Scanner;

public class Cerveja {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe quantas cervejas existem no freezer: ");
		int x = leitor.nextInt();
		
		while (x > 0){
			
			System.out.println(x + " cervejas no freezer.");
			System.out.println("Pego uma garrafa, passo pra frente.");
			x = x - 1;
			System.out.println("Agora são " + x + " cervejas no freezer.");		
			System.out.println("");
		}
		
	}

}
