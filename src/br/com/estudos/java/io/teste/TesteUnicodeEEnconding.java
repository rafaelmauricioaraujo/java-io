package br.com.estudos.java.io.teste;

import java.nio.charset.Charset;

public class TesteUnicodeEEnconding {
	
	public static void main(String[] args) {
		
		String s = "CCCC";
		
		//Imprimindo o código Unicode do string s
		System.out.println(s.codePointAt(0));
		
		//Imprimindo o Ecoding do java para o windows
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
	}

}
