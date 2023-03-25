package laboratorio2;

public class Cliente {


	 private String nome;
	 private String cpf;
	 private String dataNascimento;
	 private String endereco; 
	 private int idade;
	 
	 
	 //Construtor
	 
	 public Cliente(String nome, String cpf, String dataNascimento, String endereco, int idade) {
		 
		 this.nome = nome;
		 this.cpf = cpf;
		 this.dataNascimento = dataNascimento;
		 this.endereco = endereco;
		 this.idade = idade;
}
	 
	 //Getters and setters
	 
	 
	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) { 
		 
		 this.nome = nome;	 
	 }
	 
    public String getCpf() {
   	 return cpf;
    }
    
    public void setCpf(String cpf) {
   	 this.cpf = cpf;
    }
    
    public String getDatanascimento() {
   	 return dataNascimento;
    }
    
    public void setDatanascimento(String dataNascimento) {
   	 this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco() {
   	 return endereco;
    }
    
    public void setEndereco(String endereco) {
   	 this.endereco = endereco;
    }
    
    public int getIdade() {
     return idade;
       }
       
   public void setIdade(int idade) {
      this.idade = idade;
       }
    
   public String toString() {
	   
	   return "O cliente " + nome + " possui CPF " + cpf
			   + ", data de nascimento " + dataNascimento + ", idade " + idade + " anos e seu endereço é "
			   + endereco;
	   }
	   
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
       
    }
    
