package br.com.estudos.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		//input flow with some file
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando a escrita de uma nova linha no arquivo");
		bw.newLine();
		bw.newLine();
		bw.write("lalalalaaalala");
		
		bw.close();
	}
}
