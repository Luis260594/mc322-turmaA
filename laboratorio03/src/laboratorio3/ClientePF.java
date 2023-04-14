package laboratorio3;

import java.util.Date;



public class ClientePF extends Cliente {
	
	private final String cpf;
	private Date dataNascimento;
	private Date dataLicenca;
	private String educacao;
	private String genero;
	private String classeEconomica;
	
	public ClientePF(String nome, String endereco, Date dataLicenca, 
			String educacao, String genero, String classeEconomica,
		 String cpf, Date dataNascimento) {
		
		super(nome, endereco);
		
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.genero = genero;
		this.classeEconomica = classeEconomica;
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
    
    
    
    //Método Validar CPF
  	 
  	 public boolean validarCPF(String cpf) {
     	
     	cpf = cpf.replaceAll("[^0-9]", ""); 
     	
           if (cpf.length() != 11) {
     		
     		return false; }
  
     		boolean todosDigitosIguais = true;
     	     	
       for (int i = 1; i < cpf.length(); i++) {
     	  
      if (cpf.charAt(i) != cpf.charAt(0)){
     	  
     	 todosDigitosIguais = false;
          break;
          
       } }
     
     if (todosDigitosIguais) {
     	return false; }
     
     
     int[] cpf_numeros = new int[11];
     
     for (int i = 0; i< cpf.length(); i++) {
     	
     	cpf_numeros[i] = Character.getNumericValue(cpf.charAt(i));
     	
     }
     
     int soma1 = 0;
     int soma2 = 0;
     
     for (int i = 0; i < 9 ; i++) {
     	
     	soma1 = soma1 + cpf_numeros[i] * (10 - i);
     	
     	soma2 = soma2 + cpf_numeros[i] * (11 - i); }
     	
     	int resto1 = soma1 % 11 ; 
     	
     	if (resto1 < 2) {
     		
     		resto1 = 0; }
     	
     	else {
     		
     		resto1 = 11 - resto1; }
     	
     	
     	soma2 = soma2 + resto1 * 2;
     	
     	int resto2 = soma2 % 11;
     	
     	if (resto2 < 2) { 
     		
     		resto2 = 0; }
     	
     	else {
     		
     		resto2 = 11 - resto2;
     		
     	}
    	
     	if (cpf_numeros[9] == resto1 && cpf_numeros[10] == resto2) {
     		
     		return true; }
     	
     	else {
     		return false;
     	}
     
  	 }
  	 
  	 
  	public String toString() {
 	   
 	   return super.toString() + " O Cliente PF possui cpf " + cpf + ", data de nascimento " + dataNascimento +", data de licença " +
 	   dataLicenca + ", é da classe econômica " + classeEconomica + ", é do gênero " + genero + " e possui " +
 			   educacao;
 	   }
 	   
  	 }