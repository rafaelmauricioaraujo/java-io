package br.com.estudos.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
				
		/*
		//Criando um objeto
		String nome = "Rafael Araujo";
		
		//Instanciando uma classe que transforma o objeto em um arquivo binário
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		//gravando o objeto criado no arquivo binário
		oss.writeObject(nome);
		
		//fechando o arquivo
		oss.close();
		*/
		
		//fazendo o inverso: a partir de um arquivo binário transforma-lo em uma classe do java
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		
		//criando um objeto do tipo String para armazenar o objeto buscado e fazendo o casting
		String nome = (String) ois.readObject();
		
		ois.close();
		
		System.out.println(nome);
		
	}

}
