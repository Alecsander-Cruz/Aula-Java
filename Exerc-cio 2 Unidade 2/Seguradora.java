import java.util.*;
import java.util.ArrayList;

public class Seguradora {
	
	public int tipoCliente;
	public static String nome;
	
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
		ArrayList<Cliente>  listaClienteJ  = new ArrayList<Cliente>();
        ArrayList<Cliente>  listaClienteF  = new ArrayList<Cliente>();
        ArrayList<CadastroRes>  listaCadastroR  = new ArrayList<CadastroRes>();
        ArrayList<CadastroEmp>  listaCadastroE  = new ArrayList<CadastroEmp>();


		Scanner scan = new Scanner(System.in);
		
		int opcao = 10;
		
		while (opcao != 0){
			imprimeMenu();
			try{
			opcao = scan.nextInt();
			scan.nextLine();
			}catch(java.util.InputMismatchException e){
				scan.nextLine();
				System.out.println("Apenas valores numericos!");
			}
			switch(opcao){
				
				case 1:
					int opcao2 = 0;
					while (opcao2!=1 || opcao2!=2){
						System.out.println("Pessoa Fisica [1] ou Pessoa Juridica [2]");
						try{
							opcao2 = scan.nextInt();
						scan.nextLine();
						}catch(java.util.InputMismatchException exception){
						}
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
						System.out.println("Tipo de pessoa " + cliente.tipoPessoa);
						System.out.println("Digite o nome: ");
						nome = scan.nextLine();
						cliente.setNome(nome);
						System.out.println("Nome " + cliente.nome);
						
						System.out.println("Digite o CPF: ");
						pFisica.cpf = scan.nextLine();
						pFisica.setCpf(pFisica.cpf);
						System.out.println("CPF " + pFisica.cpf);
						
						System.out.println("Digite o endereco da residencia: ");
						cadRes.endereco = scan.nextLine();
						cadRes.setEndereco(cadRes.endereco);
						System.out.println("Endereco " + cadRes.endereco);
						
						System.out.println("Digite o valor do Imovel: ");
						while(cadRes.valorImovel == 0.0){
							try{
								cadRes.valorImovel = scan.nextFloat();
								scan.nextLine();
							}catch (java.util.InputMismatchException e){
								scan.nextLine();
								System.out.println("Apenas valores numericos!");
							}
						}
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
						listaClienteF.add(cliente);
						listaCadastroR.add(cadRes);
						
						break;
					}
					
					if(opcao2 == 2){
						Cliente cliente = new Cliente();
						PessoaJuridica pJuridica = new PessoaJuridica();
						CadastroEmp cadEmp = new CadastroEmp();
						
						cliente.setTipoPessoa(opcao2);
						System.out.println("Tipo de pessoa " + cliente.tipoPessoa);
						System.out.println("Digite o nome: ");
						nome = scan.nextLine();
						cliente.setNome(nome);
						System.out.println("Nome " + cliente.nome);
						
						System.out.println("Digite o CNPJ: ");
						pJuridica.cnpj = scan.nextLine();
						pJuridica.setCnpj(pJuridica.cnpj);
						System.out.println("CPF " + pJuridica.cnpj);
						
						System.out.println("Digite o valor do Imovel: ");
						while(cadEmp.valorImovel == 0.0){
							try{
								cadEmp.valorImovel = scan.nextFloat();
								scan.nextLine();
							}catch (java.util.InputMismatchException e){
								scan.nextLine();
								System.out.println("Apenas valores numericos!");
							}
						}
						cadEmp.setValorImovel(cadEmp.valorImovel);
						System.out.println("Valor " + cadEmp.valorImovel);
						
						System.out.println("Digite o numero de funcionarios: ");
						while(cadEmp.funcionarios == 0){
							try{
								cadEmp.funcionarios = scan.nextInt();
								scan.hasNextLine();
							}catch(java.util.InputMismatchException e){
								scan.nextLine();
								System.out.println("Apenas valores numericos!");
							}
						}
						cadEmp.setFuncionarios(cadEmp.funcionarios);
						System.out.println("Funcionarios " + cadEmp.funcionarios);
						
						
						
						System.out.println("Digite o numero de visitas diarias: ");
						while(cadEmp.visitasDiarias == 0){
							try{
								cadEmp.visitasDiarias = scan.nextInt();
								scan.nextLine();
							}catch (java.util.InputMismatchException e){
								scan.nextLine();
								System.out.println("Apenas valores numericos!");
							}
						}
						cadEmp.setVisitasDiarias(cadEmp.visitasDiarias);
						System.out.println("Visitas Diarias " + cadEmp.visitasDiarias);
						
						System.out.println("Qual o ramo, Comercio, Industria ou Agropecuaria? ");
						cadEmp.ramo = scan.nextLine();
						cadEmp.setRamo(cadEmp.ramo);
						System.out.println("Tipo " + cadEmp.ramo);
						listaClienteJ.add(cliente);
						listaCadEmp.add(cadEmp);
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
