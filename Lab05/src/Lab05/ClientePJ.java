package Lab05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class ClientePJ extends Cliente {



private final String cnpj;
private Date dataFundacao;
private int anoFundacao;
public int qtdeFuncionarios;
private List<Frota> listaFrota;

public ClientePJ(String nome, String endereco,
	 String cnpj, Date dataFundacao, int anoFundacao, int qtdeFuncionarios) {
	
	super(nome, endereco);
	
	this.cnpj = cnpj;
	this.dataFundacao = dataFundacao;
	this.qtdeFuncionarios = qtdeFuncionarios;
	this.listaFrota = new ArrayList<Frota>();
    this.anoFundacao = anoFundacao;
	
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

public int getAnoFundacao() {
	
	return anoFundacao;
	
}

public void setAnoFundacao(int anoFundacao) {
	
	this.anoFundacao = anoFundacao;
}

public List<Frota> getListaFrota() {
	 return listaFrota;
}

public String toString() {
	   
	   return super.toString() + " O Cliente PJ possui CNPJ " + cnpj + "  , data de fundação " +
	   dataFundacao + " e sua lista de frotas é " + getListaFrota().toString();
	   }



public boolean cadastrarFrota(Frota frota) {
	
	
	
	return listaFrota.add(frota);
	
}

//O método atualizar frota adiciona um veículo à lista de veículos de uma frota se receber
//true como parâmetro, e realiza a operação contrária se receber false como parâmetro

public boolean atualizarFrota(Frota frota, Veiculo veiculo, boolean addorremove) {
	
	if (addorremove = true) {
		return frota.getListaVeiculo().add(veiculo);
	}
		if (addorremove = false) {
			return frota.getListaVeiculo().remove(veiculo);
			
		}
		
		return false;
	}
	
public boolean deletarFrota(Frota frota) {
	
	return listaFrota.remove(frota);
}


//O método getVeiculosPorFrota verifica, por meio da placa, se um veículo pertence à lista de veículos de uma frota
	
public boolean getVeiculosPorFrota(String placa, Frota frota) {
	
	for(Veiculo veiculo : frota.getListaVeiculo()) {
		
		if (veiculo.getPlaca().equals(placa)) {
			return true;
		} }
		
		return false;
	
}

}




