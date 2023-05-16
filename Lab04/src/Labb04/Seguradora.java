package Labb04;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Seguradora {

	
	 private String nome;
	 private String telefone;
	 private String email;
	 private String endereco; 
	 private List<Sinistro> listaSinistros;
	 private List<Cliente> listaClientes;
	 
	 
	 
	 
	 //Construtor
	 
	 public Seguradora(String nome, String telefone, String email, String endereco) {
		 
		 this.nome = nome;
		 this.telefone = telefone;
		 this.email = email;
		 this.endereco = endereco;
		 this.listaSinistros = new ArrayList<Sinistro>();
		 this.listaClientes = new ArrayList<Cliente>();
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
     
     //Novos métodos
     
     //O método cadastrarCliente adiciona o cliente à lista de clientes e calcula o valor do seguro, 
     //atulalizando-o na variável valorSeguro de Cliente.
     
     
     public boolean cadastrarCliente(Cliente cliente) {
    	 
    	 double score = cliente.calculaScore();
    	 
    	 int qtdSinistro = 0;
 		
 		for (Sinistro s: listaSinistros) {
 			Cliente clienteAtual = s.getCliente();
 			if (cliente.equals(clienteAtual)) {
 				qtdSinistro ++;} }
 				
 		double valor = score * (1 + qtdSinistro);
 		
 		cliente.setValorSeguro(valor);
    	 
    	 
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
				"Avenida Zeferino Vaz");
    	
    	Veiculo veiculo1 = new Veiculo("ABC1234", "Gol", "ModeloA", 2020);
    	
    	ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
    	
    	
    	
    	Sinistro acidente1 = new Sinistro("data", "endereço", seguradora1, veiculo1, cliente1);
    	
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
     
    public ArrayList<Double> calcularPrecoSeguroCliente() { 
    	
    	ArrayList<Double> lista = new ArrayList<Double>();
    	
    	for (Cliente c : listaClientes) {
    		
    		double scoreAtual = c.calculaScore();
    		
    		int qtdSinistro = 0;
    		
    		for (Sinistro s: listaSinistros) {
    			Cliente clienteAtual = s.getCliente();
    			if (c.equals(clienteAtual)) {
    				qtdSinistro ++;
    				
    			} }
    		
    		double precoSeguro = scoreAtual * (1 + qtdSinistro);
    		
    		lista.add(precoSeguro); }
    		
    		return lista; }

    		
  public double calcularReceita()	{
	  ArrayList<Double> list = this.calcularPrecoSeguroCliente();
	  
	  double soma = 0;
	  
	  for (double i : list) {
		  
		  soma += i;
	  }
	  
	  return soma;}
	  
	  public String toString() {
	 	   
	 	   return "A seguradora possui nome  " + nome + ", telefone " + telefone +
	 			   ", e-mail " + email + " e endereco " + endereco; 
	
	  
	  
	  
  }
    }
     
     
     
     
     

	 
