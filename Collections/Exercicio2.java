import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
	
		int[] numeros = new int[30];
		
		Arrays.fill(numeros, 8);
		
		for(int i = 0; i<30; i++)
			System.out.println("Posição " + (i+1) + " - " + numeros[i]);
		
	}

}
