package cadastroProduto;

import java.util.Scanner;

public class ProdutoDao {
	
	static Scanner leitor = new Scanner(System.in);
	
	static Produto produtos = new Produto();
	
	
	/**
	 * Esse método realiza o cadastro dos produtos
	 * 
	 */
	public static void cadastrar(Produto produtos){
		
		System.out.print("Qual o ID do produto: ");
		produtos.Ids = leitor.nextInt();
		
		System.out.print("Qual o NOME do produto: ");
		produtos.Nomes = leitor.nextLine();
		
		System.out.println("Qual a MARCA do produto: ");
		produtos.Marcas = leitor.nextLine();
		
		System.out.print("Qual o TIPO do produto: ");
		produtos.Tipos = leitor.nextLine();
		
		System.out.print("Qual a DESCRIÇÃO do produto: ");
		produtos.Descrições = leitor.nextLine();
		
	}
	
	/**
	 * Esse método realiza a atualização dos produtos
	 * 
	 */
	public static void atualizar(Produto produtos){
		
		int x = 0;
		System.out.println("1 - ID");
		System.out.println("2 - NOME");
		System.out.println("3 - MARCA");
		System.out.println("4 - TIPO");
		System.out.println("5 - DESCRIÇÃO");
		System.out.print("Escolha a opção: ");
		x = leitor.nextInt();
		
		switch (x) {
			case 1:
				System.out.print("Qual o ID do produto: ");
				produtos.Ids = leitor.nextInt();
				break;
			case 2:
				System.out.print("Qual o NOME do produto: ");
				produtos.Nomes = leitor.nextLine();
				break;
			case 3:
				System.out.println("Qual a MARCA do produto: ");
				produtos.Marcas = leitor.nextLine();
				break;
			case 4:
				System.out.print("Qual o TIPO do produto: ");
				produtos.Tipos = leitor.nextLine();
				break;
			case 5:
				System.out.print("Qual a DESCRIÇÃO do produto: ");
				produtos.Descrições = leitor.nextLine();
				break;
			default:
				System.out.println("Esta não é uma opção válida!");
		}	
	}
		
	/**
	 * Esse método printa os produtos na tela
	 * 
	 */
	public static void listar(Produto produtos){
		
		System.out.println("Os produtos cadastrados são: ");
		System.out.println("Nome:  " + produtos.Nomes);
		System.out.println("Id:  " + produtos.Ids);
		System.out.println("Marca:  " + produtos.Marcas);
		System.out.println("Tipo:  " + produtos.Marcas);
		System.out.println("Descrição:  " + produtos.Descrições);
		
	}
	
	
	

	public static int main(String[] args) {
		
		int controle = 9;
		
		while (controle != 0){
			
			System.out.println("1 - Adicionar produtos");
			System.out.println("2 - Atualizar produtos");
			System.out.println("3 - Listar produtos");
			System.out.println("0 - Sair");
			System.out.print("Escolha a opção: ");
			controle = leitor.nextInt();
			
			if (controle == 1){
				cadastrar(produtos);
			}else if (controle == 2){
				atualizar(produtos);
			}else if (controle == 3){
				listar(produtos);
			}else if (controle == 0){
				break;
			}else{
				System.out.println("Esta não é uma opção válida!");
			}
			
		}
		
		return 0;
	}

}