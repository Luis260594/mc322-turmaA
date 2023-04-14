package laboratorio3;

import java.util.ArrayList;

import java.util.List;

public class Cliente {


	 private String nome;
	 private String endereco; 
	 private List<Veiculo> listaVeiculos;
	 
	 
	 
	 
	 //Construtor
	 
	 public Cliente(String nome, String endereco) {
		 
		 this.nome = nome;
		 this.endereco = endereco;
		 this.listaVeiculos = new ArrayList<Veiculo>();
		 
}
	 
	 //Getters and setters
	 
	 
	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) { 
		 
		 this.nome = nome;	 
	 }
	 
    
    public String getEndereco() {
   	 return endereco;
    }
    
    public void setEndereco(String endereco) {
   	 this.endereco = endereco;
    }
    
    //Método para adicionar veículos
    
    public void adicionaVeiculo(Veiculo veiculo) {
    	
    	listaVeiculos.add(veiculo);
    }
   
    //Método para listar veículos
    
    
      public void listarVeiculos() {
    	  
    	  System.out.println("A lista de placas dos veículos do cliente é:");
    	  
    	  for (Veiculo v: listaVeiculos) {
    		  
    		  System.out.println(v.getPlaca());
    		  
    	  }}
       
   public String toString() {
	   
	   
	   
	   return "O cliente " + nome + " possui endereço " + endereco;
	  
	   }
	   
    
    
    
	  
    
       
    }
    
