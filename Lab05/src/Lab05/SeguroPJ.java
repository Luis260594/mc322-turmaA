package Lab05;

import java.util.Date;

public class SeguroPJ extends Seguro {

	
	Frota frota;
	ClientePJ cliente;
	private double valorMensal;
	
	public SeguroPJ(int id, Date dataInicio, Date dataFim, Seguradora seguradora, Frota frota, ClientePJ cliente) {
		
		super(id, dataInicio, dataFim, seguradora);
		
		this.frota = frota;
		this.cliente = cliente;
		this.valorMensal = 0;
	}
	
	
public double getValorMensal() {
		
		return valorMensal; }
	
	public Frota getFrota() {
		
		return frota;
	}

	public void setFrota(Frota frota) {
		
		this.frota = frota;
	}

	public ClientePJ getCliente() {
		
		return cliente;
	}

	public void setCliente(ClientePJ cliente) {
		
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
		
		Frota frota1 = new Frota("12345");
		
		 ClientePJ cliente1 = new ClientePJ("Empresa1", "Av Albert Einstein", "12345678912345", new Date(), 1980, 200);
		Condutor condutor1 = new Condutor("12345", "Carlos", "50505050", "Avenida2", new Date());
		
		SeguroPJ seguro1 = new SeguroPJ(12345, new Date(), new Date(), seguradora1, frota1, cliente1 );
		
		
		Sinistro sinistro1 = new Sinistro("data", "Avenida 1", seguradora1, veiculo1, cliente1, condutor1, seguro1);
		
		condutor1.adicionarSinistro(sinistro1);
		
		return listaSinistros.add(sinistro1);
}


public double calcularValor() {
	
	
	
	int qtdcarros = cliente.getListaVeiculo().size();
	
	int quantidadeSinistrosCliente = listaSinistros.size();
	
	int AnosPosFundacao = 2023 - cliente.getAnoFundacao();
	
	int quantidadeSinistrosCondutor = 0;
	
	for (Condutor c : listacondutores) {
	
	for (Sinistro s : listaSinistros) {
		if (s.getCondutor().equals(c)) {
			
			quantidadeSinistrosCondutor++;
		}
		
	} }
	
	
	double score = CalcSeguro.VALOR_BASE.valor * (10 + (cliente.qtdeFuncionarios)/10) * (1 + 1/(qtdcarros +2)) * (1 + 1/(AnosPosFundacao + 2)) * (2 + quantidadeSinistrosCliente/10) * (5 + quantidadeSinistrosCondutor/10);
			
	valorMensal = score;
			return score;
}

public String toString() {
	
	return "O Seguro PJ possui frota " + frota + ", cliente " + cliente + " e seu valor mensal é "
+ valorMensal; }

}
