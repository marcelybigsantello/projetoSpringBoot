package com.masantello.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.masantello.demo.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Integer>{

}
