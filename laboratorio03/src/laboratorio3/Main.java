package laboratorio3;

import java.util.Date;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz");
		
		System.out.println("Seguradora:");
		
         
		System.out.println(seguradora1.getNome() );
		
		System.out.println(seguradora1.getTelefone() );
		
		System.out.println(seguradora1.getEmail() );
		
		System.out.println(seguradora1.getEndereco() );
		
		Veiculo veiculo1 = new Veiculo("ABC1234", "Gol", "ModeloA", 2020);
		 
		System.out.println(veiculo1.toString());
		
		
		ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date());
		
		cliente1.adicionaVeiculo(veiculo1);
				
		
		
		System.out.println(cliente1.toString());
		
		cliente1.listarVeiculos();
		
		System.out.println("O cpf é válido?");
		
		
		System.out.println(cliente1.validarCPF("43278475852"));
		
		System.out.println("O cliente foi cadastrado com sucesso?");
		
		System.out.println(seguradora1.cadastrarCliente(cliente1));
		
		
		
		
		
		
		
		Sinistro acidente1 = new Sinistro("01012023", "Avenida Zeferino Vaz", seguradora1, veiculo1, cliente1);
		
		
		
        System.out.println(acidente1.toString());
        
        
		System.out.println("O cliente foi removido com sucesso?");
		
        System.out.println(seguradora1.removerCliente("João"));
        
        Veiculo veiculo2 = new Veiculo("DEF5678", "HB20", "ModeloB", 2021);
        
        
        ClientePF cliente2 = new ClientePF("Marcos", "Rua Bertrand Russell", new Date(),
				"Ensino Superior Completo", "Masculino", "Classe Média", "43278575852", new Date());
        
        Sinistro acidente2 = new Sinistro("01012023", "Avenida Zeferino Vaz", seguradora1, veiculo2, cliente2);
        
        cliente2.adicionaVeiculo(veiculo2);
        
        
        System.out.println("O sinistro foi adicionado com sucesso?");
		System.out.println(seguradora1.adicionarSinistro(acidente2));
        
        System.out.println("O cliente foi cadastrado com sucesso?");
		
		System.out.println(seguradora1.cadastrarCliente(cliente2));
		
		ClientePJ cliente3 = new ClientePJ("Empresa1", "Av Albert Einstein", "12345678912345", new Date());
		
		 System.out.println("O cliente foi cadastrado com sucesso?");
			
			System.out.println(seguradora1.cadastrarCliente(cliente3));
			
			
			System.out.println("Gerou um sinistro com sucesso?");
			
			System.out.println(seguradora1.gerarSinistro());
			
			System.out.println("O cnpj é válido?");
			
			System.out.println(cliente3.validarCNPJ("12345678912345"));
			
			
					
		
		
        
        seguradora1.listarClientes("PJ");
        
        seguradora1.listarClientes("PF");
        
        seguradora1.visualizarSinistro("Marcos");
        
        seguradora1.listarSinistros();
		
        
        System.out.println("Menu:");
        
        System.out.println("Pressione 1 para ver o telefone da seguradora");
        
        System.out.println("Pressione 2 para ver o e-mail da seguradora");
        
        System.out.println("Pressione 3 para ver o endereço da seguradora");
        
        System.out.println("Pressione 4 para sair");
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 1;
        
        
        while (opcao != 4) {
        	
        	opcao = scanner.nextInt();
        
        
        switch (opcao) {
        

        case 1:
        	System.out.println("O telefone da seguradora é "+ seguradora1.getTelefone());
        	break;
        	
        case 2:
        	System.out.println("O e-mail da seguradora é " + seguradora1.getEmail());
        	break;
        	
        case 3:
        	System.out.println("O endereço da seguradora é " + seguradora1.getEndereco());
        	break;
        	
        	
        default:
        	System.out.println("Você não escolheu uma das opções acima");
        	break;
        
        	 } 
        
System.out.println("Menu:");
        
        System.out.println("Pressione 1 para ver o telefone da seguradora");
        
        System.out.println("Pressione 2 para ver o e-mail da seguradora");
        
        System.out.println("Pressione 3 para ver o endereço da seguradora");
        
        System.out.println("Pressione 4 para sair");
        }
        	scanner.close();
        	
        }
}
        
        
        
        
        
		
		
	


