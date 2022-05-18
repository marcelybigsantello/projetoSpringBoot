package com.masantello.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masantello.demo.dto.ClienteDto;
import com.masantello.demo.model.Cliente;
import com.masantello.demo.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {
	
	//private ClienteService service = new ClienteService();

	@Autowired
	private ClienteService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ClienteDto>> findAll(){
		List<Cliente> list = service.listAll();		
		List<ClienteDto> listDto = list.stream().map(obj -> new ClienteDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ClienteDto> findById(@PathVariable String id) {
		Cliente cliente = service.findById(id);
		return ResponseEntity.ok().body(new ClienteDto(cliente));
	}
}
