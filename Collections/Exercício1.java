import java.util.*;


public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		String[] nomes = new String [3];
		
		int i;
		
		for(i=0; i< 3; i++){
			System.out.println("Digite um nome: ");
			nomes[i] = input.nextLine();
		}
		
		Arrays.sort(nomes);
		
		for(i=0; i<3; i++){
			System.out.println(nomes[i]);
		}
		
	}

}
