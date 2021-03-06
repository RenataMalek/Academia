package academia;

import java.time.LocalDate;

public class Contrato {

	long ID;
	Cliente cliente = new Cliente();
	LocalDate dataContrato;
	int qtdParcelas;
	double valorMes;
	double valorTotal;
	int qtdModalidades;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public int getQtdModalidades() {
		return qtdModalidades;
	}

	public void setQtdModalidades(int qtdModalidades) {
		this.qtdModalidades = qtdModalidades;
	}
}
