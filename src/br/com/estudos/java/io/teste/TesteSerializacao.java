package br.com.estudos.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException {
				
		String nome = "Rafael Araujo";
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oss.writeObject(nome);
		oss.close();
		
	}

}
