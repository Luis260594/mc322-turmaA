package laboratorio3;

import java.util.Random;

public class Sinistro {
	
	private final int id;
	private String data;
	private String endereco;
	private Seguradora seguradora;
	private Veiculo veiculo;
	private Cliente cliente;
	
	//Construtor
	
	public Sinistro(String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		
		this.id = gerarId();
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		
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

   //toString

public String toString() {
	   
	   return "O sinistro possui ID " + id + ", ocorreu na data " + data +
			   ", no endereço " + endereco + ", com a seguradora " + seguradora.getNome() +
			   ", com o veículo de placa " + veiculo.getPlaca() + ", do cliente " + cliente.getNome();
	   }

}





	


