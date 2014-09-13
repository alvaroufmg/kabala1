import java.util.ArrayList;

// Será uma classe para armazenar resultados das partidas de uma determinada seleção
public class Partida {
	
	// Como a ordem de inserção será a mesma, um mesmo índice nos ArrayLists abaixo, 
	// Conrresponderá uma mesma partida.
	// Vai armazenar os ids das seleções inimigas.
	private ArrayList<Integer> ids = new ArrayList<Integer>();
	// Armazena os nomes das seleções inimigas.
	private ArrayList<String> names = new ArrayList<String>();
	// Vai armazenar o placar das seleções inimigas.
	private ArrayList<Integer> iScore = new ArrayList<Integer>();
	// Armazena o placar da seleção "dona" do objeto partida atual.
	private ArrayList<Integer> mScore = new ArrayList<Integer>();
	
	public void setGame(String name, Integer id, Integer iScore, Integer mScore){
		String newString = name;
		Integer newId = id;
		Integer newIScore = iScore;
		Integer newMScore = mScore;
		names.add(newString);
		ids.add(newId);
		iScore.add(newIScore);
	}
}
