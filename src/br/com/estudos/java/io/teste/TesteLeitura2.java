package br.com.estudos.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s %04d %08d %s %010.2f", tipo, agencia, conta, titular, saldo);
			
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
			/*
			String [] valores = linha.split(",");
			System.out.println(valores[3]);
			*/
		}
		scanner.close();
		
		
	}

}
