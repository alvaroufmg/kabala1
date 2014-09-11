
import java.util.ArrayList;

public abstract class Esporte {

	private ArrayLists <Selecao> selecoes = new ArrayList<Selecao>();
	
	//Em cada esporte será implementada a partida
	public void partida();
	
	//Composição, a classe Esporte "TEM" uma classe seleção. Apenas classes filhas e do pacote poderam acessar Selecao.
	protected class Selecao {
		
		private String name;
		private int id;
		private ArrayList <Atletas> atletas = new ArrayList <Atletas>(); 
		
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
		
		//A classe Selecao "TEM" Atletas, portanto, Atletas compôe Selecao.
		protected class Atletas {
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
