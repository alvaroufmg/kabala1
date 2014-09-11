import java.util.ArrayList;

//Composição, a classe Esporte "TEM" uma classe seleção. Apenas classes filhas e do pacote poderam acessar Selecao.
class Selecao {

	private String name;
	private int id;
	private ArrayList<Atletas> atletas = new ArrayList<Atletas>();

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

}