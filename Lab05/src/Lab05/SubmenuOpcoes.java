package Lab05;

public enum SubmenuOpcoes {
	
	
	NOVO_SEGURO("Novo seguro"),
	NOVO_SINISTRO("Novo sinistro"),
	NOVA_FROTA("Nova frota"),
	CADASTRAR_CLIENTE("Cadastrar cliente"),
	CADASTRAR_VEICULO("Cadastrar veiculo"),
	CADASTRAR_SEGURADORA("Cadastrar seguradora"),
	LISTAR_CLIENTES("Listar cliente"),
	LISTAR_SINISTROS("Listar sinistros"),
	LISTAR_VEICULOS("Listar veiculo"),
	EXCLUIR_CLIENTE("Excluir cliente"),
	EXCLUIR_VEICULO("Excluir veiculo"),
	EXCLUIR_SINISTRO("Excluir sininstro"),
	VOLTAR("Voltar");
	
	//atributo
	private final String descricao;
	
	//Construtor
	SubmenuOpcoes(String descricao){
		this.descricao = descricao;
	}
	
	//getter
	public String getDescricao() {
		return descricao;
	}

}
