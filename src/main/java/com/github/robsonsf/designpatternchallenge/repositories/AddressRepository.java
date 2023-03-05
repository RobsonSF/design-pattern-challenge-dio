package com.github.robsonsf.designpatternchallenge.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.robsonsf.designpatternchallenge.entities.Address;

public interface AddressRepository extends CrudRepository<Address, String> {
}
