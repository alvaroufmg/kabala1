package Campeonato;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EntradaESaida {
	
	// Lê os arquivos de entrada e trata possíveis exceções, como não existência de arquivo ou nome incorreto.
	void readData(){
		// Leitura e tratamento de exceção do arquivo esportes.txt.	
		try{
			FileReader sports = new FileReader("esportes.txt");
			BufferedReader readSports = new BufferedReader(sports);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readSports.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = readSports.readLine();
			}
			sports.close();
		}catch (IOException sports){
			System.err.print("Problema na leitura do arquivo esportes.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório");
		}
		
		// Leitura e tratamento de exceção do arquivo selecoes.txt.
		try{
			FileReader selecoes = new FileReader("selecoes.txt");
			BufferedReader readSelecoes = new BufferedReader(selecoes);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readSelecoes.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = readSelecoes.readLine();
			}
			selecoes.close();
		}catch (IOException selecoes){
			System.err.print("Problema na leitura do arquivo selecoes.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório");
		}
		
		// Leitura e tratamento de exceção do arquivo atletas.txt.
		try{
			FileReader athletes = new FileReader("atletas.txt");
			BufferedReader readAthletes = new BufferedReader(athletes);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readAthletes.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = readAthletes.readLine();
			}
			athletes.close();
		}catch (IOException athletes){
			System.err.print("Problema na leitura do arquivo atletas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório");
		}
		
		// Leitura e tratamento de exceção do arquivo partidas.txt.
		try{
			FileReader games = new FileReader("partidas.txt");
			BufferedReader readGames = new BufferedReader(games);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readGames.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = readGames.readLine();
			}
			games.close();
		}catch (IOException games){
			System.err.print("Problema na leitura do arquivo partidas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório");
		}
		
		// Leitura e tratamento de exceção do arquivo estatisticas.txt.
		try{
			FileReader statistics = new FileReader("estatisticas.txt");
			BufferedReader readStatistics = new BufferedReader(statistics);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readStatistics.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = readStatistics.readLine();
			}
			statistics.close();
		}catch (IOException statistics){
			System.err.print("Problema na leitura do arquivo estatisticas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório");
		}
		
	}
}
