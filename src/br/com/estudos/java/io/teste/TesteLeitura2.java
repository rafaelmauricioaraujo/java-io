package br.com.estudos.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			String [] valores = linha.split(",");
			System.out.println(valores[3]);
		}
		scanner.close();
		
		
	}

}
