package Lab05;

import java.util.Date;






import java.util.Scanner;







public class AppMain {
	
	//exibir menu externo
		private static void exibirMenuExterno() {
			MenuOpcoes menuOpcoes[] = MenuOpcoes.values();
			System.out.println("Menu principal");
			for(MenuOpcoes op: menuOpcoes) {
				System.out.println(op.ordinal() + " - " + op.getDescricao());
			}
		}
		
		/* exibir submenus
		 * se a lista de constantes do submenu for percorrida da mesma forma que o meu externo, a opção Voltar
		 * é printada com a posição que está na lista do enum (9 - Voltar). Por isso, a lista é percorrida 
		 * de forma diferente, tendo i como o inteiro correspondente. Assim, para listar o submenu de cadastros,
		 * por exemplo, vai ser printado "3 - Voltar".
		 */
		private static void exibirSubmenu(MenuOpcoes op) {
			SubmenuOpcoes[] submenu = op.getSubmenu();
			System.out.println(op.getDescricao());
			for(int i=0; i<submenu.length; i++) {
				System.out.println(i +" - " + submenu[i].getDescricao());
			}
		}
		
		//ler opções do menu externo
		private static MenuOpcoes lerOpcaoMenuExterno() {
			Scanner scanner = new Scanner(System.in);
			int opUsuario = 0;
			MenuOpcoes opUsuarioConst;
			do {
				System.out.println("Digite uma opcao: ");
				if (scanner.hasNextInt()) {
				
					
				opUsuario = scanner.nextInt();
				
					
				
				
				
				}
			}while(opUsuario < 0 || opUsuario > MenuOpcoes.values().length - 1);
			opUsuarioConst = MenuOpcoes.values()[opUsuario];
			
			
			return opUsuarioConst;
			
		}
		
		//ler opção dos submenus
		private static SubmenuOpcoes lerOpcaoSubmenu(MenuOpcoes op) {
			Scanner scanner = new Scanner(System.in);
			int opUsuario = 40;
			SubmenuOpcoes opUsuarioConst;
			do {
				
				System.out.println("Digite uma opcao: ");
			if (scanner.hasNextInt()) {
				
					
					
				opUsuario = scanner.nextInt();}
			}while(opUsuario < 0 || opUsuario > op.getSubmenu().length - 1);
			opUsuarioConst = op.getSubmenu()[opUsuario];
			
			return opUsuarioConst;
		}
		
		
		
		
		
		

	public static void main(String[] args) {

		
		
		
		Veiculo veiculo1 = new Veiculo("ABC1234", "Gol", "ModeloA", 2020);
		 
		System.out.println(veiculo1.toString());
		
		
		Veiculo veiculo2 = new Veiculo("DEF5678", "HB20", "ModeloB", 2021);
		
		
		ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 2001);
		
		ClientePJ cliente2 = new ClientePJ("Empresa1", "Av Albert Einstein", "12345678912345", new Date(),1980, 200);
		
		
		Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz", "12345");
		
		System.out.println("Seguradora:");
		
         
		System.out.println(seguradora1.getNome() );
		
		System.out.println(seguradora1.getTelefone() );
		
		System.out.println(seguradora1.getEmail() );
		
		System.out.println(seguradora1.getEndereco() );
		
		System.out.print("O nome é válido?");
		
		System.out.println(Validacao.validaNome("Ab123"));		
		
		System.out.println(Validacao.validaNome("ABCd"));
		
		
		
		Condutor condutor1 = new Condutor("12345", "Carlos", "50505050", "Avenida2", new Date());
		
		
		System.out.println("O condutor é autorizado?");
		
		System.out.println(condutor1.getAutorizado());
		
		Frota frota1 = new Frota("12345");
		
		frota1.addVeiculo(veiculo1);
		frota1.addVeiculo(veiculo2);
		
		System.out.println(frota1.toString());
		
		cliente1.cadastrarVeiculo("YUI", "Corolla", "2", 1990);
		
		cliente1.adicionaVeiculo(veiculo2);
		
		SeguroPF seguro1 = new SeguroPF(12345, new Date(), new Date(), seguradora1, veiculo1, cliente1);
		
		
		
		
		
		
		
System.out.println("O cliente foi cadastrado com sucesso?");
		
		System.out.println(seguradora1.cadastrarCliente(cliente1));
		
System.out.println("O cliente foi cadastrado com sucesso?");
		
		System.out.println(seguradora1.cadastrarCliente(cliente2));
		
		Sinistro acidente1 = new Sinistro("01012023", "Avenida Zeferino Vaz", seguradora1, veiculo1, cliente1, condutor1, seguro1);
		
		 Sinistro acidente2 = new Sinistro("01012023", "Avenida Zeferino Vaz", seguradora1, veiculo2, cliente2, condutor1, seguro1);
	     
		 seguro1.adicionaSinistro(acidente1);
			
			System.out.println("Calculando o valor do seguro: ");
			
			System.out.println(seguro1.calcularValor());
			
			System.out.println("O valor mensal do seguro é: ");
			
			System.out.println(seguro1.getValorMensal());
		 
		 
		 condutor1.adicionarSinistro(acidente1);
		 
		 condutor1.adicionarSinistro(acidente2);
			
			System.out.println(condutor1.toString());
			
			
		cliente2.cadastrarFrota(frota1);
		
		Veiculo veiculo3 = new Veiculo("GHI789", "Corolla", "ModeloA", 2019);
		
		cliente2.atualizarFrota(frota1, veiculo3, true);
		
		System.out.println(cliente2.toString());
		
		System.out.println("O carro pertence à frota?");
		
		System.out.println(cliente2.getVeiculosPorFrota("GHI789", frota1));
		
		seguradora1.adicionaPF(seguro1);
		
		SeguroPJ seguro2 = new SeguroPJ(12345, new Date(), new Date(), seguradora1, frota1, cliente2);
		
		seguradora1.adicionaPJ(seguro2);
		
		System.out.println("Calculando o valor do seguro: ");
		
		System.out.println(seguro2.calcularValor());
		
		System.out.println("O valor mensal do seguro é: ");
		
		System.out.println(seguro2.getValorMensal());
		
		seguro1.gerarSinistro();
		seguro2.gerarSinistro();
		
		System.out.println(seguro1.toString());
		
		System.out.println(seguro2.toString());
		
		
		
		
			
		
		cliente1.cadastrarVeiculo("CBA321", "Moto", "MotoA", 2005);
		
		System.out.println(cliente1.toString());
			
		 seguradora1.listarClientes("PJ");
	        
	        seguradora1.listarClientes("PF");
	        
	        seguradora1.visualizarSinistro("Marcos");
	        
	        seguradora1.listarSinistros();
	        
	        System.out.println("A receita total é:");
	        System.out.println(seguradora1.calcularReceita());
	        
	        
	        System.out.println(acidente1.toString());
	        
	        System.out.println(acidente2.toString());
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        MenuOpcoes opcao;
	        
	        do {
	            exibirMenuExterno();
	            opcao = lerOpcaoMenuExterno();
	            
	            switch (opcao) {
	            
	            case NOVO:
	            	SubmenuOpcoes submenuCadastro4;
	            	do {
	            		exibirSubmenu(opcao);
	            		submenuCadastro4 = lerOpcaoSubmenu(opcao);
	            		executarOpcaoSubMenu(submenuCadastro4, seguradora1, scanner);
	            	  } while (submenuCadastro4 != SubmenuOpcoes.VOLTAR);
                    break;
	            
	            
	                case CADASTROS:
	                    SubmenuOpcoes submenuCadastro;
	                    do {
	                        exibirSubmenu(opcao);
	                        submenuCadastro = lerOpcaoSubmenu(opcao);
	                        executarOpcaoSubMenu(submenuCadastro, seguradora1, scanner );
	                    } while (submenuCadastro != SubmenuOpcoes.VOLTAR);
	                    break;
	                case LISTAR:
	                	SubmenuOpcoes submenuCadastro2;
	                    do {
	                        exibirSubmenu(opcao);
	                        submenuCadastro2 = lerOpcaoSubmenu(opcao);
	                        executarOpcaoSubMenu(submenuCadastro2, seguradora1, scanner );
	                    } while (submenuCadastro2 != SubmenuOpcoes.VOLTAR);
	                    
	                    break;
	                case EXCLUIR:
	                	SubmenuOpcoes submenuCadastro3;
	                    do {
	                        exibirSubmenu(opcao);
	                        submenuCadastro3 = lerOpcaoSubmenu(opcao);
	                        executarOpcaoSubMenu(submenuCadastro3, seguradora1, scanner );
	                    } while (submenuCadastro3 != SubmenuOpcoes.VOLTAR);
	                    break;
	                case GERAR_SINISTRO:
	                    seguradora1.gerarSinistro();
	                    seguradora1.listarSinistros();
	                    break;
	                case TRANSFERIR_SEGURO:
	                	
	                	System.out.println("Digite o tipo do novo cliente (PF/PJ):");
		                String tipoCliente = scanner.nextLine();
		                
		                if (tipoCliente.equals("PJ")) {
		                	
		                	System.out.println("Digite o nome do cliente:");
		                    String nomeCliente = scanner.nextLine();
		                    System.out.println("Digite o endereço do cliente:");
		                    String enderecoCliente = scanner.nextLine();
		                    System.out.println("Digite o cnpj do cliente:");
		                    String cnpjCliente = scanner.nextLine();
		                    System.out.println("Digite a quantidade de funcionários do cliente:");
		                    int qtdeCliente = scanner.nextInt();
		                    System.out.println("Digite o ano de fundação:");
		                    int ano = scanner.nextInt();
		                	
		                    ClientePJ cliente;
		                    
		                    cliente = new ClientePJ(nomeCliente, enderecoCliente,
		                    	
		                    cnpjCliente, new Date(), ano, qtdeCliente);
		                    
		                    seguradora1.cadastrarCliente(cliente);
		                    
		                    System.out.println("Digite o nome do cliente antigo:");
			                String nomeCliente2 = scanner.nextLine();
			                 
			                for (Cliente c : seguradora1.getListaCliente()) {
			                	if (c.getNome().equals(nomeCliente2)){
			                		cliente.setListaVeiculo(c.getListaVeiculo());
			                		
			                		System.out.println(cliente.toString());
			                		cliente.listarVeiculos();
			                		
			                	}
			                }
			                
		                	
		                }
		                
		                else if (tipoCliente.equals("PF")) {
		                	
		                	System.out.println("Digite o nome do cliente:");
		                    String nomeCliente = scanner.nextLine();
		                    System.out.println("Digite o endereço do cliente:");
		                    String enderecoCliente = scanner.nextLine();
		                    System.out.println("Digite a educação do cliente:");
		                    String educacaoCliente = scanner.nextLine();
		                    System.out.println("Digite o gênero do cliente:");
		                    String generoCliente = scanner.nextLine();
		                    System.out.println("Digite a classe econômica do cliente:");
		                    String classeCliente = scanner.nextLine();
		                    System.out.println("Digite o CPF do cliente:");
		                    String cpfCliente = scanner.nextLine();
		                    System.out.println("Digite o ano de nascimento do cliente:");
		                    int anoCliente = scanner.nextInt();
		                    
		                    
		                    
		                    ClientePF cliente;
		                    
		                    cliente = new ClientePF(nomeCliente, enderecoCliente, new Date(), 
		                			educacaoCliente, generoCliente, classeCliente,
		                			 cpfCliente, new Date(), anoCliente);
		                    
		                    seguradora1.cadastrarCliente(cliente);
		                    
		                    System.out.println("Digite o nome do cliente antigo:");
			                scanner.nextLine();
		                    String nomeCliente3 = scanner.nextLine();
			                
			                 
			                for (Cliente c : seguradora1.getListaCliente()) {
			                	if (c.getNome().equals(nomeCliente3)){
			                		cliente.setListaVeiculo(c.getListaVeiculo());
			                		
			                		System.out.println(cliente.toString());
			                		cliente.listarVeiculos();
			                	}
			                }
			                
			                
		                }
		                	
		                	else {
		                        System.out.println("Tipo de cliente inválido!");
		                        break;
		                }
	                    
		                //Ao cadastrar o novo cliente, o valor de seguro está sendo calculado e atualizado.
		                
		                
		               
		                
		                
	                	
	                    break;
	                case CALCULAR_RECEITA:
	                	System.out.println(seguradora1.calcularReceita());
	                    break;
	                case SAIR:
	                    System.out.println("Saindo do programa...");
	                    break;
	            }
	        } while (opcao != MenuOpcoes.SAIR);
	        
	        System.out.println("Saiu do sistema");
	    }

	    public static void executarOpcaoSubMenu(SubmenuOpcoes opSubmenu, Seguradora seguradora1 , Scanner scanner) {
	        switch (opSubmenu) {
	        
	        case NOVO_SEGURO:
	        	
	        	System.out.println("Digite o tipo de seguro (PF/PJ):");
                String tipoSeguro = scanner.nextLine();
                
                if (tipoSeguro.equals("PJ")) {
                	
                	System.out.println("Digite o id do seguro:");
                	int id = scanner.nextInt();
                    
                	Frota frota = new Frota("12345");
                	
                	ClientePJ cliente1 = new ClientePJ("Empresa1", "Av Albert Einstein", "12345678912345", new Date(), 1980,  200);
                	
                    SeguroPJ seguro = new SeguroPJ(id, new Date(), new Date(), seguradora1, frota, cliente1);
                    
                    seguradora1.adicionaPJ(seguro);
                    
                    System.out.println("Seguro criado com sucesso.");
                    
                    System.out.println(seguro.toString());
                    
                    System.out.println(seguradora1.toString());
                	
                }
                
                
                else if (tipoSeguro.equals("PF")) {
                	
                	System.out.println("Digite o id do seguro:");
                	int id = scanner.nextInt();
                	
                	ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
            				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
                	
                	 Veiculo veiculo = new Veiculo("Placa", "Marca", "Modelo", 2023);
                	 
                	 SeguroPF seguro = new SeguroPF(id, new Date(), new Date(), seguradora1, veiculo, cliente1);
                	 
                	 
                	 seguradora1.adicionaPF(seguro);
                     
                     System.out.println("Seguro criado com sucesso.");
                     
                     System.out.println(seguro.toString());
                     
                     System.out.println(seguradora1.toString());
                	
                	
                }
                
                else {
                    System.out.println("Tipo de seguro inválido!");
                    break;
            }
                
                break;
	        	
	        case NOVO_SINISTRO:
	        	
	        	System.out.println("Digite o endereço do sinistro:");
                String enderecoSinistro = scanner.nextLine();
                
                Veiculo veiculo = new Veiculo("Placa", "Marca", "Modelo", 2023);
                
                ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
        				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
                
                Condutor condutor = new Condutor("CPF", "nome", "telefone", "endereço", new Date());
                
                SeguroPF seguro1 = new SeguroPF(12345, new Date(), new Date(), seguradora1, veiculo, cliente1 );
	        	
                Sinistro sinistro1 = new Sinistro("data", "Avenida 1", seguradora1, veiculo, cliente1, condutor, seguro1);
                
                System.out.println("Sinistro gerado com sucesso.");
                
                System.out.println(sinistro1.toString());
                
                condutor.adicionarSinistro(sinistro1);
                
                seguro1.adicionaSinistro(sinistro1);
               
                
                
	        	break;
	        	
	        case NOVA_FROTA:
	        	
	        	System.out.println("Digite o code da frota:");
                String code = scanner.nextLine();
                
                
                System.out.println("Digite a placa do veículo:");
                String placa2 = scanner.nextLine();
                System.out.println("Digite a marca do veículo:");
                String marca2 = scanner.nextLine();
                System.out.println("Digite o modelo do veículo:");
                String modelo2 = scanner.nextLine();
                System.out.println("Digite o ano de fabricação do veículo:");
                int ano2 = scanner.nextInt();
                
                Veiculo veiculo2;
                
                veiculo2 = new Veiculo(placa2, marca2, modelo2, ano2);
                
                Frota frota1 = new Frota(code);
                
                frota1.addVeiculo(veiculo2);
                
                System.out.println("Frota criada com sucesso. Veículo adicionado.");
                
                System.out.println(frota1.toString());
                
	        	break;
	        	
	        	
	        
	        
	            case CADASTRAR_CLIENTE:
	            	
	            	//Para cadastrar clientes, está sendo utilizada a seguradora1 instanciada na Main.
	            	
	            	System.out.println("Digite o tipo de cliente (PF/PJ):");
	                String tipoCliente = scanner.nextLine();
	                
	                if (tipoCliente.equals("PJ")) {
	                	
	                	System.out.println("Digite o nome do cliente:");
	                    String nomeCliente = scanner.nextLine();
	                    System.out.println("Digite o endereço do cliente:");
	                    String enderecoCliente = scanner.nextLine();
	                    System.out.println("Digite o cnpj do cliente:");
	                    String cnpjCliente = scanner.nextLine();
	                    System.out.println("Digite a quantidade de funcionários do cliente:");
	                    int qtdeCliente = scanner.nextInt();
	                    System.out.println("Digite o ano de fundação:");
	                    int ano = scanner.nextInt();
	                	
	                	
	                    ClientePJ cliente;
	                    
	                    cliente = new ClientePJ(nomeCliente, enderecoCliente,
	                    	
	                    cnpjCliente, new Date(), ano, qtdeCliente);
	                    
	                    seguradora1.cadastrarCliente(cliente);
	                	
	                }
	                
	                else if (tipoCliente.equals("PF")) {
	                	
	                	System.out.println("Digite o nome do cliente:");
	                    String nomeCliente = scanner.nextLine();
	                    System.out.println("Digite o endereço do cliente:");
	                    String enderecoCliente = scanner.nextLine();
	                    System.out.println("Digite a educação do cliente:");
	                    String educacaoCliente = scanner.nextLine();
	                    System.out.println("Digite o gênero do cliente:");
	                    String generoCliente = scanner.nextLine();
	                    System.out.println("Digite a classe econômica do cliente:");
	                    String classeCliente = scanner.nextLine();
	                    System.out.println("Digite o CPF do cliente:");
	                    String cpfCliente = scanner.nextLine();
	                    System.out.println("Digite o ano de nascimento do cliente:");
	                    int anoCliente = scanner.nextInt();
	                    
	                    
	                    
	                    ClientePF cliente;
	                    
	                    cliente = new ClientePF(nomeCliente, enderecoCliente, new Date(), 
	                			educacaoCliente, generoCliente, classeCliente,
	                			 cpfCliente, new Date(), anoCliente);
	                    
	                    seguradora1.cadastrarCliente(cliente);
	                }
	                	
	                	else {
	                        System.out.println("Tipo de cliente inválido!");
	                        break;
	                }
	            	
	            	seguradora1.listarClientes("PF");
	            	seguradora1.listarClientes("PJ");
	            	
	            	
	                
	                break;
	                
	            case CADASTRAR_VEICULO:
	            	System.out.println("Digite a placa do veículo:");
                    String placa = scanner.nextLine();
                    System.out.println("Digite a marca do veículo:");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o modelo do veículo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite o ano de fabricação do veículo:");
                    int ano = scanner.nextInt();
                    
                    Veiculo veiculo1;
                    
                    veiculo1 = new Veiculo(placa, marca, modelo, ano);
                    
                    System.out.println(veiculo1.toString());
                    
                    
	                break;
	            case CADASTRAR_SEGURADORA:
	            	System.out.println("Digite o nome da seguradora:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone da seguradora:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o e-mail da seguradora:");
                    String email = scanner.nextLine();
                    System.out.println("Digite o endereço da seguradora:");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o número do CNPJ:");
                    String cnpj = scanner.nextLine();
                    
                    Seguradora seguradora;
                    
                    seguradora = new Seguradora(nome, telefone, email, endereco, cnpj);
                    
                    System.out.println(seguradora.toString());
                    System.out.println("Cadastro realizado com sucesso.");
	            	
	                break;
	            case LISTAR_CLIENTES:
	                seguradora1.listarClientes("PF");
	                seguradora1.listarClientes("PJ");
	                break;
	            case LISTAR_SINISTROS:
	                seguradora1.listarSinistros();
	                break;
	            case LISTAR_VEICULOS:
	                System.out.println("Escreva o nome do cliente:");
	                String nomeC = scanner.nextLine();
	                for (Cliente c: seguradora1.getListaCliente()) {
	                	
	                	if (c.getNome().equals(nomeC)) {
	                		c.listarVeiculos();
	                	}
	                	
	                }
	                
	                
	                break;
	            case EXCLUIR_CLIENTE:
	            	System.out.println("Escreva o nome do cliente:");
	                String nomeCl = scanner.nextLine();
	                for (Cliente c: seguradora1.getListaCliente()) {
	                	
	                	if (c.getNome().equals(nomeCl)) {
	                		seguradora1.removerCliente(c.getNome());
	                	}
	                	
	                }
	                System.out.println("Cliente removido com sucesso.");
	                seguradora1.listarClientes("PF");
	                seguradora1.listarClientes("PJ");
	                
	                
	                break;
	            case EXCLUIR_VEICULO:
	            	System.out.println("Escreva o nome do cliente:");
	                String nomeCli = scanner.nextLine();
	                for (Cliente c: seguradora1.getListaCliente()) {
	                	
	                	if (c.getNome().equals(nomeCli)) {
	                		
	                		System.out.println("Escreva a placa do veículo:");
	    	                String placa1 = scanner.nextLine();
	                		for (Veiculo v : c.getListaVeiculo()) {
	                			if (v.getPlaca().equals(placa1)) {
	                				c.removeVeiculo(v);
	                				c.listarVeiculos();
	                			}
	                		}
	                		
	                	}
	                	
	                }
	                
	                System.out.println("Veículo removido com sucesso.");
	                
	                break;
	            case EXCLUIR_SINISTRO:
	            	System.out.println("Escreva o ID do sinistro:");
	                int id = scanner.nextInt();
	                for (Sinistro s: seguradora1.getListaSinistro())
	     {
	                	
	                	if (s.getId() == id) {
	                	seguradora1.removeSinistro(s);
	                	}
	                	
	                }
	                break;
	            case VOLTAR:
	                System.out.println("Voltando ao menu principal...");
	                break;
	        }
	    }
		
		
		
		
				
		
		
	} 
