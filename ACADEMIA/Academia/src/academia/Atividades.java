package academia;

public class Atividades {

	private long ID;
	private String nome;
	private int qtdSecao;
	private int qtdRepeticao;
	private double tempoDuracao;
	
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
	public int getQtdSecao() {
		return qtdSecao;
	}
	public void setQtdSecao(int qtdSecao) {
		this.qtdSecao = qtdSecao;
	}
	public int getQtdRepeticao() {
		return qtdRepeticao;
	}
	public void setQtdRepeticao(int qtdRepeticao) {
		this.qtdRepeticao = qtdRepeticao;
	}
	public double getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
}
