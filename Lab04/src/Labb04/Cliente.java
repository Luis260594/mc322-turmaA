package Labb04;

import java.util.ArrayList;
import java.util.List;


public class Cliente {


private String nome;
private String endereco; 
private List<Veiculo> listaVeiculos;
private double valorSeguro;




//Construtor

public Cliente(String nome, String endereco) {
	 
	 this.nome = nome;
	 this.endereco = endereco;
	 this.listaVeiculos = new ArrayList<Veiculo>();
	 this.valorSeguro = 0;
	 
}

//Getters and setters


public String getNome() {
	 return nome;
}

public void setNome(String nome) { 
	 
	 this.nome = nome;	 
}


public String getEndereco() {
	 return endereco;
}

public void setEndereco(String endereco) {
	 this.endereco = endereco;}
	 
	 
public List<Veiculo> getListaVeiculo() {
	
return listaVeiculos;

}

public void setListaVeiculo(List<Veiculo> listaVeiculos) {
	this.listaVeiculos = listaVeiculos;
}

public double getValorSeguro() {
	
	return valorSeguro;
}

public void setValorSeguro(double valorSeguro) {
	
	this.valorSeguro = valorSeguro;
}

//Método para adicionar veículos

public void adicionaVeiculo(Veiculo veiculo) {
	
	listaVeiculos.add(veiculo);
}


public void removeVeiculo(Veiculo veiculo) {
	
	listaVeiculos.remove(veiculo);
}

//Método para listar veículos


 public void listarVeiculos() {
	  
	  System.out.println("A lista de placas dos veículos do cliente é:");
	  
	  for (Veiculo v: listaVeiculos) {
		  
		  System.out.println(v.getPlaca());
		  
	  }}
  
public String toString() {
  
  
  
  return "O cliente " + nome + " possui endereço " + endereco;
 
  }


public double calculaScore() {

	System.out.println("Defina o tipo de cliente");

 return 1.0;

  
} }
