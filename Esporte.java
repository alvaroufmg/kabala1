import java.util.ArrayList;

public abstract class Esporte {

	private int id;
	private String name;
	private ArrayList<Selecao> selecoes = new ArrayList<Selecao>();

	// Em cada esporte será implementada a partida
	public void game() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	// Insere as seleções dentro da classe esporte.
	public void insertSelecoes(String selecaoName, int selecaiId) {
		Selecao novo = new Selecao();
		novo.setName(selecaoName);
		novo.setId(selecaiId);
		this.selecoes.add(novo);
	}
	public ArrayList<Selecao> geth(){
		return selecoes;
	}

}
