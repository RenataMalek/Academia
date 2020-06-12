package academia;

import java.util.ArrayList;
import java.util.List;

public class Treino {

	private long ID;
	private String tipo;
	private String nivel;
	List<Atividades> atividades = new ArrayList<Atividades>();

	public void adicionarAtividades(Atividades a) {
		atividades.add(a);
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
