package com.github.robsonsf.designpatternchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.robsonsf.designpatternchallenge.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
