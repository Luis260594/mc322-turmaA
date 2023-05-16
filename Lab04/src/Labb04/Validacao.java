package Labb04;

public class Validacao {
	
	
public static boolean validarCPF(String cpf) {
     	
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

public static boolean validarCNPJ(String cnpj) {
	
	cnpj = cnpj.replaceAll("[^0-9]", "");
	
	if (cnpj.length() != 14) {
		
		return false;
	}
	
	int soma = 0;
	int peso = 2;
	
	for (int i = 11; i >= 0; i--) {
		
		int digito = Integer.parseInt(cnpj.substring(i, i+1));
		soma += digito * peso;
		peso++;
		
		if (peso == 10) {
			
			peso = 2;
		}
	}
	
	int resto = soma % 11;
	int digito1 = resto < 2 ? 0 : 11 - resto;
	
	soma = 0;
	peso = 2;
	
	for (int i = 12; i >= 0; i--) {
		
		int digito = Integer.parseInt(cnpj.substring(i, i+1));
		
		soma += digito * peso;
		
		peso++;
		
		if (peso == 10) {
			peso = 2;
		}
	}
	
	resto = soma % 11;
	int digito2 = resto < 2 ? 0 : 11 - resto;
	
	if (Integer.parseInt(cnpj.substring(12, 13)) != digito1 || Integer.parseInt(cnpj.substring(13, 14)) != digito2) {
		return false;
	}
	
	return true;
}

  public static boolean validaNome(String nome) {
	  
	  return nome.matches("[a-zA-Z]+");
	  
	  
	  
	  
	  
	  
  }

}
