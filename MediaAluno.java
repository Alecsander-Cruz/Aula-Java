package br.unipe.java.unidade1;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = leitor.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = leitor.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float nota3 = leitor.nextFloat();
		
		float media = ((nota1 + nota2+ nota3)/3);
		
		if (media>=7) {
			System.out.println("O aluno foi aprovado. Sua média é: " + media);
		}
		else if (media>=5) {
			System.out.println("O aluno foi para recuperação. Sua média é: " + media);
			}
			else{
				System.out.println("O aluno foi reprovado. Sua média é: " + media);
			}
		
	}

}