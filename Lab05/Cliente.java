package Lab05;

import java.util.ArrayList;
import java.util.List;


public abstract class Cliente {


private String nome;
private String endereco; 
public List<Veiculo> listaVeiculos;





//Construtor

public Cliente(String nome, String endereco) {
	 
	 this.nome = nome;
	 this.endereco = endereco;
	 this.listaVeiculos = new ArrayList<Veiculo>();
	
	 
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




public boolean adicionaVeiculo(Veiculo veiculo) {
	
	return listaVeiculos.add(veiculo);
}

public boolean removeVeiculo(Veiculo veiculo) {
	
	return listaVeiculos.remove(veiculo);
}

//Método para listar veículos


 public void listarVeiculos() {
	  
	  System.out.println("A lista de placas dos veículos do cliente é:");
	  
	  for (Veiculo v: listaVeiculos) {
		  
		  System.out.println(v.getPlaca());
		  
	  }}
  
public String toString() {
  
  
  
  return "O cliente " + nome + " possui endereço " + endereco + " e sua lista de veículos é" +
  getListaVeiculo().toString();
 
  }




  
} 