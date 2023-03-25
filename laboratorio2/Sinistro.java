package laboratorio2;

import java.util.Random;

public class Sinistro {
	
	private int id;
	private String data;
	private String endereco;
	
	//Construtor
	
	public Sinistro(String data, String endereco) {
		
		this.id = gerarId();
		this.data = data;
		this.endereco = endereco;
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
}
	

