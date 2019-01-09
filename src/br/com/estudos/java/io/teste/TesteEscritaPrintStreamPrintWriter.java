package br.com.estudos.java.io.teste;

import java.io.IOException;

import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
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
		
		ps.close();
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		pw.println("Testando a escrita usando outra classe, a PrintWriter");
		pw.close();
	
	}
}
