package academia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	Cliente cliente = new Cliente();
	Pagamento pgto = new Pagamento();
	private long ID;
	private LocalDate dataContrato;
	private int qtdParcelas;
	private double valorMes;
	private double valorTotal;
	List<Treino> treinos = new ArrayList<Treino>();

	public void adicionarTreino(Treino t) {
		treinos.add(t);
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public double getValorMes() {
		return valorMes;
	}

	public void setValorMes(double valorMes) {
		this.valorMes = valorMes;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
