package academia;

import java.time.LocalDate;

public class Pagamento {

	private long ID_Contrato;
	private LocalDate dataPgto;
	private double valor;
	private int qtdParcelas;
	private boolean pago;
	
	public long getID_Contrato() {
		return ID_Contrato;
	}
	public void setID_Contrato(long iD_Contrato) {
		ID_Contrato = iD_Contrato;
	}
	public LocalDate getDataPgto() {
		return dataPgto;
	}
	public void setDataPgto(LocalDate dataPgto) {
		this.dataPgto = dataPgto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
}
