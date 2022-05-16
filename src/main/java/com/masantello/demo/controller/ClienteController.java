package com.masantello.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masantello.demo.model.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = new ArrayList<>();
		Cliente c1 = new Cliente(1, "Marcely", "marcely@sbsoftware.com.br", "1235696785");
		Cliente c2 = new Cliente(2, "Marcos", "marcos@sbsoftware.com.br", "1235696785");
		Cliente c3 = new Cliente(3, "Daniely", "daniely@sbsoftware.com.br", "987654321");
		Cliente c4 = new Cliente(4, "Dircely", "dircely@sbsoftware.com.br", "1235696785");
		
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
//		list.add(c4);
		
		list.addAll(Arrays.asList(c1, c2, c3, c4));
		
		return ResponseEntity.ok().body(list);
	}
}
