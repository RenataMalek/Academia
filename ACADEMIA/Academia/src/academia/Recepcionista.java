package academia;

public class Recepcionista {

	private long ID;
	private String nome;
	private long CPF;
	private long telefone;
	private String codigoAcesso;
	
	
	public Recepcionista(long iD, String nome, long cPF, long telefone, String codigoAcesso) {
		this.ID = iD;
		this.nome = nome;
		this.CPF = cPF;
		this.telefone = telefone;
		this.codigoAcesso = codigoAcesso;
	}
	

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

}
