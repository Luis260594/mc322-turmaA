package Lab05;

import java.util.Date;

public class SeguroPF extends Seguro {
	
	private Veiculo veiculo;
	private ClientePF cliente;
	private double valorMensal;
	
	
	public SeguroPF(int id, Date dataInicio, Date dataFim, Seguradora seguradora, Veiculo veiculo, ClientePF cliente) {
		
		super(id, dataInicio, dataFim, seguradora);
		
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.valorMensal = 0;
	    
	}
	



public double getValorMensal() {
		
		return valorMensal;
		
	}	

	public Veiculo getVeiculo() {
		
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		
		this.veiculo = veiculo;
	}

	public ClientePF getCliente() {
		
		return cliente;
	}

	public void setCliente(ClientePF cliente) {
		
		this.cliente = cliente;
	}

	
	public void desautorizarCondutor(Condutor condutor) {
		 condutor.setAutorizado(false);
	}

	public void autorizarCondutor(Condutor condutor) {
		 condutor.setAutorizado(true);
	}
	
	public boolean gerarSinistro() {
		
		Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz", "12345");
		
		Veiculo veiculo1 = new Veiculo("ABC1234", "Carro", "ModeloA", 2020);
		
		ClientePF cliente1 = new ClientePF("João", "Avenida Zeferino Vaz", new Date(),
				"Ensino Médio Completo", "Masculino", "Classe Média", "43278575852", new Date(), 1990);
		
		Condutor condutor1 = new Condutor("12345", "Carlos", "50505050", "Avenida2", new Date());
		
		SeguroPF seguro1 = new SeguroPF(12345, new Date(), new Date(), seguradora1, veiculo1, cliente1 );
		
		
		Sinistro sinistro1 = new Sinistro("data", "Avenida 1", seguradora1, veiculo1, cliente1, condutor1, seguro1);
		
		condutor1.adicionarSinistro(sinistro1);
		
		return listaSinistros.add(sinistro1);
}
	
	
	//Valor mensal é inicializado com zero e conforme for chamado o método calcularValor(), o valor é atualizado

	public double calcularValor() {
		
	
		
		
		
int qtdcarros = this.cliente.getListaVeiculo().size();


  		
  		double score = 0;
  		
  		int quantidadeSinistrosCliente =  listaSinistros.size();
  		
  		
  		
  		int quantidadeSinistrosCondutor = 0;
  		
  		for (Condutor c : listacondutores) {
  		
  		for (Sinistro s : listaSinistros) {
  			if (s.getCondutor().equals(c)) {
  				
  				quantidadeSinistrosCondutor++;
  			}}}
  		
  		
  		
  		
  		
  		
  		
  		if ((2023 - cliente.getAnoNascimento()) > 18 && (2023 - cliente.getAnoNascimento()) <= 30) {
  		
  		 score = CalcSeguro.VALOR_BASE.valor *  CalcSeguro.FATOR_18_30.valor * (1 + 1/(qtdcarros + 2)) * (2 + quantidadeSinistrosCliente/10) * (5 + quantidadeSinistrosCondutor/10);
  		
  		}
  		
  		
  	   if ((2023 - cliente.getAnoNascimento()) > 30 && (2023 - cliente.getAnoNascimento()) <= 60) {
  		   
  	   
  			  		
  		 score = CalcSeguro.VALOR_BASE.valor *  CalcSeguro.FATOR_30_60.valor * (1 + 1/(qtdcarros + 2)) * (2 + quantidadeSinistrosCliente/10) * (5 + quantidadeSinistrosCondutor/10); 
  		
  	   }
  	   
  		
  		
  		if ((2023 - cliente.getAnoNascimento()) > 60 && (2023 - cliente.getAnoNascimento()) <= 90) {
  			
  	
  			  		
  			score = CalcSeguro.VALOR_BASE.valor *  CalcSeguro.FATOR_60_90.valor * (1 + 1/(qtdcarros + 2)) * (2 + quantidadeSinistrosCliente/10) * (5 + quantidadeSinistrosCondutor/10);
  			
  		}
  			  		
  			  		
  		
  		
  		
  		
  		
	valorMensal = score;
  		
  		return score;
}

public String toString() {
	
	return "O Seguro PF possui veículo " + veiculo + ", cliente " + cliente + " e seu valor mensal é " + valorMensal;
	
	
}}

