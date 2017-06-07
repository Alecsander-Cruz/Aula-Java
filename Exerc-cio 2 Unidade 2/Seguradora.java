import java.util.*;

public class Seguradora {
	
	public int tipoCliente;
	public String nome;
	
	public static void imprimeMenu(){
		System.out.println("SEGURADORA DE IMOVEIS");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Contrato");
		System.out.println("3 - Listar Cliente");
		System.out.println("4 - Listar Contrato");
		System.out.println("5 - Cadastrar Sinistro");
		System.out.println("6 - Listar Sinistro");
		System.out.println("7 - Listar Contratos sem Sinistro");
		System.out.println("8 - Persistencia com Serializacao");
		System.out.println("0 - Sair");
		
		System.out.println("Entre com uma opcao: ");
	}
	
	public static int tipoCliente(int opt){
		
		Scanner scan = new Scanner(System.in);
		
		
		scan.close();
		return opt;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcao = 10;
		while (opcao != 0){
			imprimeMenu();
			opcao = scan.nextInt();
			
			switch(opcao){
				
				case 1:
					int opcao2 = 10;
					while (opcao2!=1 || opcao2!=2){
						System.out.println("Pessoa Fisica [1] ou Pessoa Juridica [2]");
						opcao2 = scan.nextInt();
						scan.nextLine();
						if (opcao2 == 1 || opcao2 ==2){
							break;
						}
						if (opcao2 !=1 && opcao2 !=2){
							System.out.println("Opcao invalida, por favor escolher entre 1 e 2.");
							scan.next();
						}
					}
					if (opcao2 ==1){
						Cliente cliente = new Cliente();
						PessoaFisica pFisica = new PessoaFisica();
						CadastroRes cadRes = new CadastroRes();
						
						cliente.setTipoPessoa(opcao2);
						System.out.println(cliente.tipoPessoa);
						System.out.println("Digite o nome: ");
						cliente.nome = scan.nextLine();
						cliente.setNome(cliente.nome);
						System.out.println("Nome " + cliente.nome);
						
						System.out.println("Digite o CPF: ");
						pFisica.cpf = scan.nextLine();
						pFisica.setCpf(pFisica.cpf);
						System.out.println("CPF " + pFisica.cpf);
						
						System.out.println("Digite o endereço da residencia: ");
						cadRes.endereco = scan.nextLine();
						cadRes.setEndereco(cadRes.endereco);
						System.out.println("Endereco " + cadRes.endereco);
						
						System.out.println("Digite o valor do Imovel: ");
						cadRes.valorImovel = scan.nextFloat();
						scan.nextLine();
						cadRes.setValorImovel(cadRes.valorImovel);
						System.out.println("Valor " + cadRes.valorImovel);
						
						System.out.println("Em qual zona esta localizada a residencia, Urbana, Suburbana ou Rural? ");
						cadRes.zona = scan.nextLine();
						cadRes.setZona(cadRes.zona);
						System.out.println("Zona " + cadRes.zona);
						
						System.out.println("Qual o tipo de residencia, Apartamento ou Casa? ");
						cadRes.tipo = scan.nextLine();
						cadRes.setTipo(cadRes.tipo);
						System.out.println("Tipo " + cadRes.tipo);
						break;
					}
				case 2:
					System.out.println("Funcao ainda nao disponivel!");
					break;
				
				case 3:
					System.out.println("Funcao ainda nao disponivel!");
					break;
					
				case 4:
					System.out.println("Funcao ainda nao disponivel!");
					break;
					
				case 5:
					System.out.println("Funcao ainda nao disponivel!");
					break;
					
				case 6:
					System.out.println("Funcao ainda nao disponivel!");
					break;
				
				case 7:
					System.out.println("Funcao ainda nao disponivel!");
					break;
				
				case 8:
					System.out.println("Funcao ainda nao disponivel!");
					break;	
			}
			
			if (opcao < 0 || opcao > 8){
				System.out.println("Opcao invalida, por favor, tente um numero entre 0 e 8!");
			}
			
		}
		scan.close();

	}

}
