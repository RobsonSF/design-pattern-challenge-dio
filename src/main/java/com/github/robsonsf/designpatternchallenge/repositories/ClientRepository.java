package com.github.robsonsf.designpatternchallenge.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.robsonsf.designpatternchallenge.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{

}
