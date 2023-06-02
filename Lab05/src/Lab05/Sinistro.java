package Lab05;

import java.util.Random;





public class Sinistro {
	
	private final int id;
	private String data;
	private String endereco;
	private Seguradora seguradora;
	private Veiculo veiculo;
	private Cliente cliente;
	private Condutor condutor;
	private Seguro seguro;
	
	//Construtor
	
	public Sinistro(String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente, Condutor condutor, Seguro seguro) {
		
		this.id = gerarId();
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.condutor = condutor;
		this.seguro = seguro;
		
	}

	//Getters and setters
	
	
	public int getId() {
		return id;
	}
	
    
	// Não há setId(), pois o número é gerado pela função gerarId()
	
    public String getData() {
	    return data;
	}
			
    public void setData(String data) { 
		this.data = data;	 
	}
		 
    public String getEndereco() {
        return endereco;
			}
			
    public void setEndereco(String endereco) { 
		this.endereco = endereco;	 
		}
    
     private int gerarId() {
    	 Random numero = new Random();
    	 return numero.nextInt(1000);
     }
     
     
     public Seguradora getSeguradora() {
 	    return seguradora;
 	}
 			
     public void setSeguradora(Seguradora seguradora) { 
 		this.seguradora = seguradora;	 
 	}
     
     public Veiculo getVeiculo() {
  	    return veiculo;
  	}
  			
      public void setVeiculo(Veiculo veiculo) { 
  		this.veiculo = veiculo;	 
  	}
      public Cliente getCliente() {
    	    return cliente;
    	}
    			
        public void setCliente(Cliente cliente) { 
    		this.cliente = cliente;	 
    	}
        
        public Condutor getCondutor() {
        	return condutor;
 
        }
        
        public void setCondutor(Condutor condutor) {
        	this.condutor = condutor;
        	
        }
        
        public Seguro getSeguro() {
        	return seguro;
       
        }
        
        public void setSeguro(Seguro seguro) {
        	this.seguro = seguro;
        }

   //toString

public String toString() {
	   
	   return "O sinistro possui ID " + id + ", ocorreu na data " + data +
			   ", no endereço " + endereco + ", com a seguradora " + seguradora.getNome() +
			   ", com o veículo de placa " + veiculo.getPlaca() + ", do cliente " + cliente.getNome();
	   }

}





	
