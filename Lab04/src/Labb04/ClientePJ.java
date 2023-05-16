package Labb04;

import java.util.Date;


public class ClientePJ extends Cliente {



private final String cnpj;
private Date dataFundacao;
private int qtdeFuncionarios;

public ClientePJ(String nome, String endereco,
	 String cnpj, Date dataFundacao, int qtdeFuncionarios) {
	
	super(nome, endereco);
	
	this.cnpj = cnpj;
	this.dataFundacao = dataFundacao;
	this.qtdeFuncionarios = qtdeFuncionarios;
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

public int getQtdeFuncionarios() {
	
	return qtdeFuncionarios;
	
}

public void setQtdeFuncionarios(int qtdeFuncionarios) {
	
	this.qtdeFuncionarios = qtdeFuncionarios;
}

public String toString() {
	   
	   return super.toString() + " O Cliente PJ possui CNPJ " + cnpj + " e data de fundação " + dataFundacao;
	   }

@Override
public double calculaScore() {
	
	int qtdcarros = getListaVeiculo().size();
	
	double score = CalcSeguro.VALOR_BASE.valor * (1 + (qtdeFuncionarios)/100) * qtdcarros;
			
			return score;
}


}


