package Campeonato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EntradaESaida {

	// Leitura e tratamento de exceção do arquivo esportes.txt.
	void readSports() {
		try {
			Scanner sports = new Scanner(new FileReader("esportes.txt"));
			while(sports.hasNextLine()) {
				String linha = sports.nextLine();
				System.out.println(linha);
			}
			sports.close();
		} catch (IOException sports) {
			System.err
					.print("Problema na leitura do arquivo esportes.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório\n");
		}
	}

	// Leitura e tratamento de exceção do arquivo selecoes.txt.
	void readSelecoes() {
		try {
			FileReader selecoes = new FileReader("selecoes.txt");
			BufferedReader readSelecoes = new BufferedReader(selecoes);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readSelecoes.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = readSelecoes.readLine();
			}
			selecoes.close();
		} catch (IOException selecoes) {
			System.err
					.print("Problema na leitura do arquivo selecoes.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório\n");
		}
	}

	// Leitura e tratamento de exceção do arquivo atletas.txt.
	void readAthletes() {
		try {
			FileReader athletes = new FileReader("atletas.txt");
			BufferedReader readAthletes = new BufferedReader(athletes);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readAthletes.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = readAthletes.readLine();
			}
			athletes.close();
		} catch (IOException athletes) {
			System.err
					.print("Problema na leitura do arquivo atletas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório\n");
		}
	}

	// Leitura e tratamento de exceção do arquivo partidas.txt.
	void readGames() {
		try {
			FileReader games = new FileReader("partidas.txt");
			BufferedReader readGames = new BufferedReader(games);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readGames.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = readGames.readLine();
			}
			games.close();
		} catch (IOException games) {
			System.err
					.print("Problema na leitura do arquivo partidas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório\n");
		}
	}

	// Leitura e tratamento de exceção do arquivo estatisticas.txt.
	void readStatistics() {
		try {
			FileReader statistics = new FileReader("estatisticas.txt");
			BufferedReader readStatistics = new BufferedReader(statistics);
			// Lendo a primeira linha. Depois disso vou ler linha por linha.
			String linha = readStatistics.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = readStatistics.readLine();
			}
			statistics.close();
		} catch (IOException statistics) {
			System.err
					.print("Problema na leitura do arquivo estatisticas.txt. \nVerifique se o nome está correto ou se o arquivo se encontra no diretório\n");
		}
	}
}