package com.masantello.demo;

import java.io.Serializable;

import com.masantello.demo.model.Cliente;

public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	private String CPF;
	
	public ClienteDto() {
		
	}
	
	public ClienteDto(Cliente obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
		this.CPF = obj.getCPF();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}
