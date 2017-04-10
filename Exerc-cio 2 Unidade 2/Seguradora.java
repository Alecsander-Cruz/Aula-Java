import java.util.Scanner;

public class Seguradora {
	
	public int tipoCliente;
	public String nome;
	private Scanner scan;
	
	public void imprimeMenu(){
		System.out.println("SEGURADORA DE IMÓVEIS");
		System.out.println("1- Cadastrar Cliente");
		System.out.println("2- Cadastrar Contrato");
		System.out.println("3- Listar Cliente");
		System.out.println("4- Listar Contrato");
		System.out.println("5- Cadastrar Sinistro");
		System.out.println("6- Listar Sinistro");
		System.out.println("7- Listar Contratos sem Sinistro");
		System.out.println("8- Persistencia com Serializacao");
		System.out.println("0- Sair");
	
		System.out.println("Entre com uma opcÃ£o: ");
	}
	
	public int tipoCliente(int opt){
		
		scan = new Scanner(System.in);
		
		while (opt !=1 || opt !=2 ){
			System.out.println("Pessoa Física [1] ou Pessoa Jurídica [2]");
			opt = scan.nextInt();
			if (opt !=1 && opt !=2 ){
				System.out.println("Opção inválida, por favor escolha entre 1 e 2.");
			}
			
				
		}
		
		return opt;
	}
	
	public void main(String[] args) {
		
		
		int opcao = 0;
		scan = new Scanner(System.in);
		while (opcao != 0){
			imprimeMenu();
			opcao = scan.nextInt();
			
			switch(opcao){
			
			case 1:
				int opcao2 = 0;
				tipoCliente(opcao2);
				if (opcao2 == 1){
					
					Cliente cliente = new Cliente();
					PessoaFisica pFisica = new PessoaFisica();
					CadastroRes cadRes = new CadastroRes();
					
					cliente.setTipoPessoa(opcao2);
					System.out.println("Digite o seu nome: ");
					cliente.setNome(scan.nextLine());
					System.out.println("Digite o seu cpf: ");
					pFisica.setCpf(scan.nextLine());
					System.out.println();
					
				}
			
			
			}
		
			if (opcao == 1){
				int option = 0;
				
				if (option == 1){
					//cadastroFisica
				}
				else{
					//cadastroJURIDICA
				}
			}
			if (opcao == 2){
			
			}
			if (opcao == 3){
			
			}
			if (opcao == 4){
			
			}
			if (opcao == 5){
			
			}
			if (opcao == 6){
			
			}
			if (opcao == 7){
		
			}
			if (opcao == 8){
		
			}
			if (opcao < 0 || opcao > 8){
				System.out.println("Opção inválida, por favor, tente novamente!");
			}
			else {
				break;
			}
			}
		scan.close();

	}

}
