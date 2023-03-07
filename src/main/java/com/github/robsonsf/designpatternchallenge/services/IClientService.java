package com.github.robsonsf.designpatternchallenge.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.github.robsonsf.designpatternchallenge.entities.Client;

public interface IClientService {

	Page<Client> findAllPaged(Pageable pageable);

	Client findById(Long id);

	void insert(Client client);

	void update(Long id, Client client);

	void delete(Long id);
}
