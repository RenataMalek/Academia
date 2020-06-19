package academia;

import java.time.LocalDate;

public class Cobranca {

	private long ID_Contrato;
	private LocalDate dataPgto;
	private double valor;
	private int numParcela;
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
	public int getNumParcela() {
		return numParcela;
	}
	public void setNumParcela(int numParcela) {
		this.numParcela = numParcela;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
}
