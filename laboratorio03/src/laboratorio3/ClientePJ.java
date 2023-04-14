package laboratorio3;

import java.util.Date;


public class ClientePJ extends Cliente {



private final String cnpj;
private Date dataFundacao;

public ClientePJ(String nome, String endereco,
	 String cnpj, Date dataFundacao) {
	
	super(nome, endereco);
	
	this.cnpj = cnpj;
	this.dataFundacao = dataFundacao;
}




public String getCnpj() {
	  
    return cnpj;
}

//cnpj não possui set, pois foi declarado como final

public Date dataFundacao() {
    return dataFundacao;
	    }
	    
public void setDataFundacao(Date dataFundacao) {
	this.dataFundacao = dataFundacao;
	
	    }

public String toString() {
	   
	   return super.toString() + " O Cliente PJ possui CNPJ " + cnpj + " e data de fundação " + dataFundacao;
	   }


public boolean validarCNPJ(String cnpj) {
	
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
}


