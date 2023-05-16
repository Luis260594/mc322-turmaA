package Labb04;

import java.util.Date;



public class ClientePF extends Cliente {
	
	private final String cpf;
	private Date dataNascimento;
	private Date dataLicenca;
	private String educacao;
	private String genero;
	private String classeEconomica;
	private int anoNascimento;
	
	public ClientePF(String nome, String endereco, Date dataLicenca, 
			String educacao, String genero, String classeEconomica,
		 String cpf, Date dataNascimento, int anoNascimento) {
		
		super(nome, endereco);
		
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.genero = genero;
		this.classeEconomica = classeEconomica;
		this.anoNascimento = anoNascimento;
	}

	 public int getAnoNascimento() {
		 return anoNascimento;
	 }
	 
	 public void setAnoNascimento(int anoNascimento) {
		 this.anoNascimento = anoNascimento;
		 
	 }
	
	public Date getDataLicenca() {
      	return dataLicenca;
       }
       
    public void setDataLicenca(Date dataLicenca) {
        this.dataLicenca = dataLicenca;
      	 
       }
       
    public String getEducacao() {
        return educacao;
    	    }
    	    
    public void setEducacao(String educacao) {
    	this.educacao = educacao;
    	
    	    }
    
    public String getGenero() {
      	 return genero;
       }
       
   public void setGenero(String genero) {
      	this.genero = genero;
       }
    
   public String getClasseEconomica() {
        return classeEconomica;
         }
         
   public void setClasseEconomica(String classeEconomica) {
        this.classeEconomica = classeEconomica;
         }
      



    public String getCpf() {
  	  
        return cpf;
   }
   
   //cpf não possui set, pois foi declarado como final
    
    public Date dataNascimento() {
        return dataNascimento;
    	    }
    	    
    public void setDataNascimento(Date dataNascimento) {
    	this.dataNascimento = dataNascimento;
    	
    	    }
    
    
  	 
  	 
  	public String toString() {
 	   
 	   return super.toString() + " O Cliente PF possui cpf " + cpf + ", data de nascimento " + dataNascimento +", data de licença " +
 	   dataLicenca + ", é da classe econômica " + classeEconomica + ", é do gênero " + genero + " e possui " +
 			   educacao;
 	   }
 	   
  	@Override
  	public double calculaScore() {
  		
  		int qtdcarros = getListaVeiculo().size();
  		
  		double score = 0;
  		
  		if (2023 - anoNascimento > 18 && 2023 - anoNascimento <= 30) {
  		
  		 score = CalcSeguro.VALOR_BASE.valor *  CalcSeguro.FATOR_18_30.valor * qtdcarros;
  		}
  		
  	   if (2023 - anoNascimento > 30 && 2023 - anoNascimento <= 60) {
  		   
  	   
  			  		
  		score = CalcSeguro.VALOR_BASE.valor * CalcSeguro.FATOR_30_60.valor * qtdcarros; 
  	   }
  		
  		
  		if (2023 - anoNascimento > 60 && 2023 - anoNascimento <= 90) {
  			
  	
  			  		
  		 score = CalcSeguro.VALOR_BASE.valor * CalcSeguro.FATOR_60_90.valor * qtdcarros;
  		}
  			  		
  			  		
  		
  		
  		
  		return score;
  		
  	}
  	
  	
  	
  	}
  	

