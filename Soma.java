package br.unipe.java.unidade1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Dezite o primeiro n�mero para efetuar a soma: ");
		x = leitor.nextInt();
		System.out.println("Dezite o segundo n�mero para efetuar a soma: ");
		y = leitor.nextInt();
		
		System.out.println("A soma dos dois n�meros �: " + (x+y));

	}

}
