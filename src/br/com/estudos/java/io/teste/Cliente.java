package br.com.estudos.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1504207092629861639L;
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
