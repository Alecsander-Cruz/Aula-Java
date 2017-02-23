package cadastroProduto;

import java.util.Scanner;

public class ConsumoMedio {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a kilometragem percorrida: ");
		float distancia = leitor.nextFloat();

		System.out.println("Digite o total de combustível gasto (em Litros): ");
		float combustivel = leitor.nextFloat();

		System.out.println("A média de gasto de combustivel é: " + (distancia/combustivel) + " Km/L.");
		leitor.close();

	}
	
}