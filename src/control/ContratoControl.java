package control;

import java.util.ArrayList;
import java.util.List;

import academia.Cobranca;
import academia.Contrato;
import academia.Treino;

public class ContratoControl {

	List<Treino> treinos = new ArrayList<Treino>();
	List<Cobranca> cobrancas = new ArrayList<Cobranca>();

	public void gerarCobranca(Contrato c) {

		for (int aux = 0; aux <= c.getQtdParcelas(); aux++) {
			Cobranca co = new Cobranca();
			co.setID_Contrato(c.getID());
			co.setDataPgto(c.getDataContrato());
			co.setValor(c.getValorMes());
			co.setNumParcela(aux + 1);
			cobrancas.add(co);
		}

	}
	
	public void confirmarPagamento(int parcela) {
		for(Cobranca co : cobrancas) {
			if(co.getNumParcela() == parcela) {
				co.setPago(true);
			}
		}
	}
	
	public boolean permitirEntrada(int parcela) {
		
		
		
		return false;
	}
}
