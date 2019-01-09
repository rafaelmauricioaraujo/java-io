package br.com.estudos.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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

		
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write("Testando a escrita com uma classe de mais alto nível");
		fw.write("\r\n");
		fw.write("\r\n");
		fw.write("Lalalalllallalla");
		
		fw.close();
	}
}
