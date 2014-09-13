import java.util.ArrayList;

//Composição, a classe Esporte "TEM" uma classe seleção. Apenas classes filhas e do pacote poderam acessar Selecao.
class Selecao {

	private String name;
	private int id;
	private ArrayList<Atletas> atletas = new ArrayList<Atletas>();
	private Partida partida = new Partida();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Inserindo atletas na seleção.
	public void insertAthlete(String athleteName, int athleteId) {
		Atletas novo = new Atletas();
		novo.setName(athleteName);
		novo.setId(athleteId);
		this.atletas.add(novo);
	}

}