package br.com.estudos.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
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

		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Testando a escrita com uma classe de mais alto nível");
		//fw.write("\r\n");
		//fw.write("\r\n");
		//bw.write(System.lineSeparator());
		//bw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Lalalalllallalla");
		
		bw.close();
	}
}
