package control;

import java.util.ArrayList;
import java.util.List;

import academia.Atividades;
import academia.Treino;

public class TreinadorControl {

	// remover iniciador quando montar o banco de dados; substituir por increment ID
	long idTreino = 0;
	long idAtividade = 0;

	List<Treino> treino = new ArrayList<Treino>();

	public void mostrarTreinos(String nivel, String tipo) {

		Treino t = new Treino();
		t.setID(idTreino);
		t.setNivel(nivel);
		t.setTipo(tipo);

		// quando for implementar a tela, nesse ponto, coloque um enquanto botao
		// "finalizar" não for pressionado, seguir colocando atividades, algo desse tipo
		// while() {
		// novasAtividades(nome, qtdSecao, qtd Repeticao, tempoDuracao);
		// }

		idTreino++;
		treino.add(t);
	}

	public void novasAtividades(String nome, int qtdSecao, int qtdRepeticao, double tempoDuracao) {
		Atividades a = new Atividades();
		a.setID(idAtividade);
		a.setNome(nome);
		a.setQtdSecao(qtdSecao);
		a.setQtdRepeticao(qtdRepeticao);
		a.setTempoDuracao(tempoDuracao);
	}
	
	public void atualizarTreino(long id, String nivel, String tipo) {
		for(Treino treino : treino) {
			if (treino.getID() == id) {
				treino.setNivel(nivel);
				treino.setTipo(tipo);
			}
		}
	}
	
	public void mostrarTodosTreinos() {
		for(Treino treino : treino) {
			System.out.println(treino);
		}
	}

	public void vincularClienteAoTreino(int id_contrato) {

		// implementar

	}
}
