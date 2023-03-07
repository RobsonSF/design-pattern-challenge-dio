package com.github.robsonsf.designpatternchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.robsonsf.designpatternchallenge.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
