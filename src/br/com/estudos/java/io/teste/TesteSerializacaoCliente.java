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
		Cliente cliente = new Cliente();
		cliente.setNome("Rafael");
		cliente.setProfissao("Dev");
		cliente.setCpf("111222333-44");
		
		//Instanciando uma classe que transforma o objeto em um arquivo binário
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		
		//gravando o objeto criado no arquivo binário
		oss.writeObject(cliente);
		
		//fechando o arquivo
		oss.close();
		*/
		
		//Fazendo a leitura do arquivo binário e salvando em uma instância de cliente
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(cliente.getNome());
		
	}
}
