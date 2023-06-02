package Lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public abstract class Seguro {

	private final int id;
	private Date dataInicio;
	private Date dataFim;
	private Seguradora seguradora;
	protected List<Sinistro> listaSinistros;
	public List<Condutor> listacondutores;
	
	
	
	
	//Construtor
	
	public Seguro(int id, Date dataInicio, Date dataFim, Seguradora seguradora) {
		
	
	
	this.id = id;
	this.dataInicio = dataInicio;
	this.dataFim = dataFim;
	this.seguradora = seguradora;
	
	this.listaSinistros = new ArrayList<Sinistro>();
	this.listacondutores = new ArrayList<Condutor>();
	
	
	
}
	
	//Getters e Setters
	
	
	
	
	
	
	
	
	public Seguradora getSeguradora() {
		return seguradora;
	}
	
	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}
	
	
	public int getId() {
		
		return id;
		
	}

	//Como id é final, não possui método set

	public Date getDataInicio() {
	    return dataInicio;
		    }
		    
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
		
		    }
	public Date getDataFim() {
	    return dataFim;
		    }
		    
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
		
		    }

public List<Sinistro> getListaSinistro() {
	 return listaSinistros;
}

public List<Condutor> getListaCondutores() {
	 return listacondutores;
}

public boolean adicionaSinistro(Sinistro sinistro) {
	
	return listaSinistros.add(sinistro);
}

//Método Autoriza e Desautoriza condutor, presentes nas classes filhas 

public abstract void desautorizarCondutor(Condutor condutor);
	

public abstract void autorizarCondutor(Condutor condutor);
	


//Método Calcula Valor, que será reescrito nas classes filhas

public abstract double calcularValor();
	
	






public abstract boolean gerarSinistro();
	
	
	
	
	

}