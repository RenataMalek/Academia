package control;

import java.util.ArrayList;
import java.util.List;

import academia.Recepcionista;
import academia.Treinador;

public class AcademiaControl {

	// remover iniciador quando montar o banco de dados; substituir por increment ID
	long idR = 0;
	long idT = 0;

	List<Recepcionista> recepcionista = new ArrayList<Recepcionista>();
	List<Treinador> treinador = new ArrayList<Treinador>();

	// tratamento recepcionista

	public void adicionarRecepcionista(String nome, long CPF, String telefone, String codigoAcesso) {
		Recepcionista r = new Recepcionista();
		r.setID(idR);
		r.setNome(nome);
		r.setCPF(CPF);
		r.setTelefone(telefone);
		r.setCodigoAcesso(codigoAcesso);
		
		idR++;

		recepcionista.add(r);
	}

	public void atualizarRecepcionista(long ID, String nome, long CPF, String telefone, String codigoAcesso) {
		for (Recepcionista r : recepcionista) {
			if (r.getID() == ID) {
				r.setNome(nome);
				r.setCPF(CPF);
				r.setTelefone(telefone);
				r.setCodigoAcesso(codigoAcesso);
			}
		}
	}

	public void buscarRecepcionista(long ID) {
		for (Recepcionista r : recepcionista) {
			if (r.getID() == ID) {
				System.out.println(r);
			}
		}
	}

	public void mostrarTodasRecepcionista() {
		for (Recepcionista r : recepcionista) {
			System.out.println(r);
		}
	}

	public boolean acessoRecepcionista(String codigoAcesso) {

		boolean entrar = false;

		for (Recepcionista r : recepcionista)
			if (r.getCodigoAcesso().equals(codigoAcesso)) {
				System.out.println("Acesso permitido");
				return entrar = true;
			} else {
				System.out.println("Acesso invalido");
				return entrar = false;
			}
		return entrar;
	}

	// tratamento treinador

	public void adicionarTreinador(String nome, long CPF, String telefone, String codigoAcesso) {
		Treinador t = new Treinador();
		t.setID(idR);
		t.setNome(nome);
		t.setCPF(CPF);
		t.setTelefone(telefone);
		t.setCodigoAcesso(codigoAcesso);
		
		idT++;

		treinador.add(t);
	}

	public void atualizarTreinador(long ID, String nome, long CPF, String telefone, String codigoAcesso) {
		for (Treinador t : treinador) {
			if (t.getID() == ID) {
				t.setNome(nome);
				t.setCPF(CPF);
				t.setTelefone(telefone);
				t.setCodigoAcesso(codigoAcesso);
			}
		}
	}

	public void buscarTreinador(long ID) {
		for (Treinador t : treinador) {
			if (t.getID() == ID) {
				System.out.println(t);
			}
		}
	}

	public void mostrarTodosTreinador() {
		for (Treinador t : treinador) {
			System.out.println(t);
		}
	}

	public boolean acessoTreinador(String codigoAcesso) {

		boolean entrar = false;

		for (Treinador t : treinador)
			if (t.getCodigoAcesso().equals(codigoAcesso)) {
				System.out.println("Acesso permitido");
				return entrar = true;
			} else {
				System.out.println("Acesso invalido");
				return entrar = false;
			}
		return entrar;
	}
}
