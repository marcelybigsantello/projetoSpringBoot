package com.masantello.demo.dto;

import java.io.Serializable;
import java.util.Optional;

import com.masantello.demo.model.Cliente;

public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	private String CPF;
	
	public ClienteDto() {
		
	}
	
	public ClienteDto(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.CPF = cliente.getCPF();
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
