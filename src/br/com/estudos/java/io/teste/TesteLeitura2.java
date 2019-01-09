package br.com.estudos.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		String linha;
		
		while(scanner.hasNextLine()) {
			linha = scanner.nextLine();
			System.out.println(linha);
		}
		
		scanner.close();
	}

}
