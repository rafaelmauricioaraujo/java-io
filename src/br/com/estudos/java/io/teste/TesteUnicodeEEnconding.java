package br.com.estudos.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEnconding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "CCCC";
		
		//Imprimindo o código Unicode do string s
		System.out.println(s.codePointAt(0));
		
		//Imprimindo o Ecoding do java para o windows
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length);
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length);
		
		bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length);
	}
}
