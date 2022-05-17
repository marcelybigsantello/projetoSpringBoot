package com.masantello.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.masantello.demo.model.Cliente;
import com.masantello.demo.repository.ClienteRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		clienteRepository.deleteAll();
		
		Cliente c1 = new Cliente(null, "Marcely Santello", "marcely@sbsoftware.com.br", "789456123");
		Cliente c2 = new Cliente(null, "Marcos Biguzzi", "marcos@sbsoftware.com.br", "789456332");
		Cliente c3 = new Cliente(null, "Dircely Rodrigues", "dircely@sbsoftware.com.br", "123456789");
		Cliente c4 = new Cliente(null, "Daniely Biguzzi", "daniely@sbsoftware.com.br", "976543210");
		Cliente c5 = new Cliente(null, "Marcos Roberto", "marcos@sbsoftware.com.br", "987321654");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		
	}

}
