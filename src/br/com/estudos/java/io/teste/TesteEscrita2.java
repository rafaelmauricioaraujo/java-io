package br.com.estudos.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {

		
		//output flow with some file
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		//bw.write("Testando a escrita de uma nova linha no arquivo");
		//bw.newLine();
		//bw.newLine();
		//bw.write("lalalalaaalala");
		
		//bw.close();
		
		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Testando a escrita com uma outra classa, a PrintStream");
		ps.println();
		ps.println("Eita, lalalaaalala");
	
	}
}
