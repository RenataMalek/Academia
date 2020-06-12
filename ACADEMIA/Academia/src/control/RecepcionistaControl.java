package control;

import java.util.ArrayList;
import java.util.List;

import academia.Cliente;
import academia.Contrato;

public class RecepcionistaControl {

	List<Cliente> clientes = new ArrayList<Cliente>();
	List<Contrato> contratos = new ArrayList<Contrato>();

	public void novoCliente(Cliente cli) {
		clientes.add(cli);
	}

	public void novoContrato(Contrato con) {
		contratos.add(con);
	}

	public Cliente buscarCliente(int CPF) {
		Cliente c = new Cliente();
		c.setCPF(CPF);
		return c;
	}

	public void novoContrato(int CPF) {

	}

	public void atualizarContrato(int CPF) {

	}

	public Contrato buscarContrato(int CPF) {
		Contrato c = new Contrato();

		return c;
	}

}
