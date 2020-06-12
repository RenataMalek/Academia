package control;

import java.util.ArrayList;
import java.util.List;

import academia.Cliente;
import academia.Contrato;

public class RecepcionistaControl {

	// remover iniciador quando montar o banco de dados; substituir por increment ID
	long idCli = 0;
	long idCon = 0;

	List<Cliente> clientes = new ArrayList<Cliente>();
	List<Contrato> contratos = new ArrayList<Contrato>();

	// tratamento manter cliente

	public void novoCliente(long ID, long CPF, String nome, String email, String telefone, String endereço) {
		Cliente c = new Cliente();

		c.setID(ID);
		c.setCPF(CPF);
		c.setNome(nome);
		c.setEmail(email);
		c.setTelefone(telefone);
		c.setEndereço(endereço);

		idCli++;

		clientes.add(c);
	}

	public void atualizarCliente(long ID, long CPF, String nome, String email, String telefone, String endereço) {
		for (Cliente c : clientes) {
			if (c.getID() == ID) {
				c.setCPF(CPF);
				c.setNome(nome);
				c.setEmail(email);
				c.setTelefone(telefone);
				c.setEndereço(endereço);
			}
		}
	}

	public Cliente buscarCliente(int CPF) {

		for (Cliente c : clientes) {
			if (c.getCPF() == CPF) {
				return c;
			}
		}

		return null;
	}

	public void mostrarTodosClientes() {

		for (Cliente c : clientes) {
			System.out.println(c);
		}

	}

	// tratamento manter contrato

	public void novoContrato(int CPF) {

	}

	public void atualizarContrato(int CPF) {

	}

	public Contrato buscarContrato(int CPF) {
		Contrato c = new Contrato();

		return c;
	}

}
