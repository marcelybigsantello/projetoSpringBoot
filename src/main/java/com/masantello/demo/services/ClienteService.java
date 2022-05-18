package com.masantello.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.masantello.demo.model.Cliente;
import com.masantello.demo.repository.ClienteRepository;
import com.masantello.demo.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> listAll(){
		return repository.findAll();
	}

	
	public Cliente findById(String id) {
		Optional<Cliente> cliente = repository.findById(Integer.parseInt(id));
		
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
