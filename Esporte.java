//importar bibliotecas

public abstract class Esporte {

	private ArrayLists
	
	//Em cada esporte será implementada a partida
	public void partida();
	
	//Composição, a classe Esporte "TEM" uma classe seleção.
	public class Selecao {
		
		private String name;
		private int id;

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
	}
}
