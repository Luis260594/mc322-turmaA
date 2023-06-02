package Lab05;

import java.util.ArrayList;
import java.util.List;

public class Frota {

	private String code;
	private List<Veiculo> listaVeiculos;
	
	//Construtor
	
	public Frota(String code) {
		
	this.code = code;	
	
	this.listaVeiculos = new ArrayList<Veiculo>();
	
}
	//Getters e Setters
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	

	public List<Veiculo> getListaVeiculo() {
		
		return listaVeiculos;
}
	
	//Métodos para adicionar e remover veículos
	
	public boolean addVeiculo(Veiculo veiculo) {
		
		return listaVeiculos.add(veiculo);
		
	}
	
	
public boolean removeVeiculo(Veiculo veiculo) {
		
		return listaVeiculos.remove(veiculo);
}
		
	
	//Método toString da classe Frota
	
	public String toString() {
		
		return "A frota possui code " + code + " e sua lista de veículos é " + getListaVeiculo().toString();
	}
}