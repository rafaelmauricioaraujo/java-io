package br.com.estudos.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		
		//Imprimindo o código Unicode do string s
		System.out.println(s.codePointAt(0));
		
		//Imprimindo o Ecoding do java para o windows
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + " Padrão");
		String snovo = new String(bytes);
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + " UTF-8");
		
		bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + " Windows-1252");
		snovo = new String(bytes, "UTF-8");
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + " UTF-16");
		snovo = new String(bytes, "US-ASCII");
		System.out.println(snovo);
		
		//Outra maneira de fazer o mesmo
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + " US_ASCII");
			
	}
}
