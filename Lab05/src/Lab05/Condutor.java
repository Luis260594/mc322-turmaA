package Lab05;

import java.util.List;


import java.util.ArrayList;

import java.util.Date;

public class Condutor {
	
	private final String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	private Date dataNasc;
	private List<Sinistro> listaSinistros;
	private boolean autorizado;
	
	//Construtor
	
	
public Condutor(String cpf, String nome, String telefone, String endereco, Date dataNasc) {
	

this.cpf = cpf;
this.nome = nome;
this.telefone = telefone;
this.endereco = endereco;
this.dataNasc = dataNasc;
this.listaSinistros = new ArrayList<Sinistro>();
this.autorizado = true;

//O condutor começa com o atributo autorizado igual a true e case seja 
//necessário, esse valor pode ser alterado para false por meio dos métodos correspondentes
	
}

//Getters e Setters

public String getCpf() {
	 return cpf;
}

//Como cpf é final, não possui método set

public String getNome() {
	 return nome;
}

public void setNome(String nome) { 
	 
	 this.nome = nome;	 
}
public String getTelefone() {
	 return telefone;
}

public void setTelefone(String telefone) { 
	 
	 this.telefone = telefone;	 
}
public String getEndereco() {
	 return endereco;
}

public void setEndereco(String endereco) { 
	 
	 this.endereco = endereco;	 
}

public Date getDataNasc() {
	 return dataNasc;
}

public void setDataNasc(Date dataNasc) { 
	 
	 this.dataNasc = dataNasc;	 
}


public List<Sinistro> getListaSinistro() {
	 return listaSinistros;
}

public boolean getAutorizado() {
	
	return autorizado; }

public void setAutorizado(boolean autorizado) {
	
	this.autorizado = autorizado;}

public boolean adicionarSinistro(Sinistro sinistro) {
	
	return listaSinistros.add(sinistro);
}

// Método toString da classe Consdutor

public String toString() {
	
	return "O condutor de nome " + nome +" possui cpf " + cpf + ", telefone " + telefone + 
			", endereco " + endereco + ", data de nascimento " + dataNasc + " e sua lista de sinistros é "+
	getListaSinistro().toString();
		
					
}


}

