package Lab05;

import java.util.List;



import java.util.ArrayList;
import java.util.Date;

public class Seguradora {

	 private final String cnpj;
	 private String nome;
	 private String telefone;
	 private String email;
	 private String endereco; 
	 private List<Sinistro> listaSinistros;
	 private List<Cliente> listaClientes;
	 private List<SeguroPF> listaSeguros1;
	 private List<SeguroPJ> listaSeguros2;
	 
	 
	 
	 
	 //Construtor
	 
	 Seguradora(String nome, String telefone, String email, String endereco, String cnpj) {
		 
		 this.nome = nome;
		 this.telefone = telefone;
		 this.email = email;
		 this.endereco = endereco;
		 this.listaClientes = new ArrayList<Cliente>();
		 this.listaSinistros = new ArrayList<Sinistro>();
		 this.listaSeguros1 = new ArrayList<SeguroPF>();
		 this.listaSeguros2 = new ArrayList<SeguroPJ>();
		 this.cnpj = cnpj;
}
	 
	 //Getters and setters
	 
	 
	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) { 
		 
		 this.nome = nome;	 
	 }
	 
     public String getTelefone() {
    	 return telefone;
     }
     
     public void setTelefone(String telefone) {
    	 this.telefone = telefone;
     }
     
     public String getEmail() {
    	 return email;
     }
     
     public void setEmail(String email) {
    	 this.email = email;
     }
     
     public String getEndereco() {
    	 return endereco;
     }
     
     public void setEndereco(String endereco) {
    	 this.endereco = endereco;
     }
     
     public List<Cliente> getListaCliente() {
    	 return listaClientes;
     }
     
     public List<Sinistro> getListaSinistro() {
    	 return listaSinistros;
    }
     
     public List<SeguroPF> getListaSeguros() {
    	 return listaSeguros1;
    }
     
     public List<SeguroPJ> getListaSeguros2() {
    	 return listaSeguros2;
    }
     
     //Como cnpj é final, possui apenas get 
     
     public String getCnpj() {
    	 return cnpj; 
     }
     //Novos métodos
     
     
     public boolean adicionaPF(SeguroPF seguro) {
    	 
    	 return listaSeguros1.add(seguro);
     }
     
     
public boolean adicionaPJ(SeguroPJ seguro) {
    	 
    	 return listaSeguros2.add(seguro);
     }
     
     //O método cadastrarCliente adiciona o cliente à lista de clientes e calcula o valor do seguro, 
     //atulalizando-o na variável valorSeguro de Cliente.
     
     
     public boolean cadastrarCliente(Cliente cliente) {
    	 
    	 
 		
    	 
    	 
    	return listaClientes.add(cliente);	
    	
     }
     
     public boolean removerCliente(String Nome) {
    	 
    	 for (Cliente c : listaClientes) {
    		 
    		 if (c.getNome() == Nome) {
    			 
    			 listaClientes.remove(c);
    			 
    			 return true; }
    			 
    			 
    		 }
    	 
    	 return false;
    		
    	 }
    	 
     
    public List<Cliente> listarClientes(String tipoCliente) {
    	
    	List<Cliente> lista = new ArrayList<Cliente>();
    	
    	if (tipoCliente == "PF") {
    		
    		
    		for (Cliente c: listaClientes) {
    			
    			if (c instanceof ClientePF) {
    				
    		    System.out.println("A lista de clientes PF é:");
    				
    		    System.out.println(c.getNome());
    			
    			lista.add(c);}}}
    			
    	
         if (tipoCliente == "PJ") {
    		
    		for (Cliente c: listaClientes) {
    			
    			if (c instanceof ClientePJ) {
    				
    				System.out.println("A lista de clientes PJ é:");
    				
    		    System.out.println(c.getNome());
    			
    			lista.add(c);}}}
    			
    		
    			
    			return lista;
    	
    			
    	}
    	
    
    public boolean gerarSinistro() { 
    	
    	Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz", "12345");
    	
    	Veiculo veiculo1 = new Veiculo("ABC1234", "Carro", "ModeloA", 2020);
    	
    	ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
    	Condutor condutor1 = new Condutor("12345", "Carlos", "50505050", "Avenida2", new Date());
    	
    	SeguroPF seguro1 = new SeguroPF(12345, new Date(), new Date(), seguradora1, veiculo1, cliente1 );
    	
    	
    	
    	Sinistro acidente1 = new Sinistro("data", "endereço", seguradora1, veiculo1, cliente1, condutor1, seguro1);
    	
    	return listaSinistros.add(acidente1);
    } 
    	
    
    public List<Sinistro> listarSinistros() {
    	
    	for (Sinistro s : listaSinistros) {
    		
    		
    		
    		System.out.println(s.toString());
    		
    		
    	}
    	
    	return listaSinistros;
    }

     
    public boolean visualizarSinistro(String Nome) {
    	
    	for (Sinistro s : listaSinistros) {
    		
    		if (s.getCliente().getNome() == Nome) {
    			
    			System.out.println("O ID do sinistro visualizado é: ");
    			System.out.println(s.getId());
    			return true;
    	
    			
    		}
    	}
    	return false;
    	
    	
    }
    
    public boolean adicionarSinistro(Sinistro sinistro) {
   	 
    	return listaSinistros.add(sinistro);	
    	
     }
    
    public void removeSinistro(Sinistro sinistro) {
    	
    	listaSinistros.remove(sinistro);
    }
     
    

    		
  public double calcularReceita()	{
	  
	  double soma = 0;
	  
	  for (SeguroPF s : listaSeguros1) {
		  
		  soma = soma + s.getValorMensal(); }
	  
for (SeguroPJ j : listaSeguros2) {
		  
		  soma = soma + j.getValorMensal(); }
	  
	  
	  
		  
	 
	  
	  return soma;}
  
  public boolean gerarSeguroPF() {
	  
	  Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz", "12345");
	  
	  Veiculo veiculo1 = new Veiculo("ABC1234", "Carro", "ModeloA", 2020);
	  
	  ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
	  
	  SeguroPF seguro1 = new SeguroPF(12345, new Date(), new Date(), seguradora1, veiculo1, cliente1 );
	  
	  return listaSeguros1.add(seguro1);
	  
	  
  }
  
  
public boolean gerarSeguroPJ() {
	  
	  Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz", "12345");
	  
	  
	  
	  Frota frota1 = new Frota("12345");
	  
	  ClientePJ cliente1 = new ClientePJ("Empresa1", "Av Albert Einstein", "12345678912345", new Date(), 1980,  200);
	  
	  SeguroPJ seguro1 = new SeguroPJ(12345, new Date(), new Date(), seguradora1, frota1, cliente1 );
	  
	  return listaSeguros2.add(seguro1);
	  
	  
  }
  
  public boolean cancelarSeguroPF(Seguro seguro) {
	  
	  return listaSeguros1.remove(seguro);
  }
	  
public boolean cancelarSeguroPJ(Seguro seguro) {
	  
	  return listaSeguros2.remove(seguro);
  }
  
  public List <Seguro> getSegurosPFPorCliente(Cliente cliente ) {
	   List <Seguro> segurosCliente = new ArrayList<Seguro>() ;
	  for ( SeguroPF seguro : listaSeguros1 ) {
	   if ( seguro.getCliente().equals(cliente)) {
	   segurosCliente.add(seguro);
	   }
	   }
	   return segurosCliente;
  }
  
  
  public List <Seguro> getSegurosPJPorCliente(Cliente cliente ) {
	   List <Seguro> segurosCliente = new ArrayList<Seguro>() ;
	  for ( SeguroPJ seguro : listaSeguros2 ) {
	   if ( seguro.getCliente().equals(cliente)) {
	   segurosCliente.add(seguro);
	   }
	   }
	   return segurosCliente;
 }
  
  public List <Sinistro> getSinistrosPorCliente(Cliente cliente ) {
	   List <Sinistro> sinistrosCliente = new ArrayList<Sinistro>() ;
	  for ( Sinistro sinistro : listaSinistros ) {
	   if ( sinistro.getCliente().equals(cliente)) {
	   sinistrosCliente.add(sinistro);
	   }
	   }
	   return sinistrosCliente;
 }
  
	  public String toString() {
	 	   
	 	   return "A seguradora possui cnpj " +cnpj + " , nome  " + nome + ", telefone " + telefone +
	 			   ", e-mail " + email + " , endereco " + endereco + " , sua lista de sinistros é " 
	 			   + getListaSinistro().toString() + " , sua lista de clientes é " + 
	 			  getListaCliente().toString() + " e sua lista de seguros é " + getListaSeguros().toString();
	
	  
	  
	  
  }
    }
     
     
     
     
     

	 
