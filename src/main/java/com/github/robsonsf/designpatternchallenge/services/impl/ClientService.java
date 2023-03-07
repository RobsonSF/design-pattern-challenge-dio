package com.github.robsonsf.designpatternchallenge.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.robsonsf.designpatternchallenge.entities.Address;
import com.github.robsonsf.designpatternchallenge.entities.Client;
import com.github.robsonsf.designpatternchallenge.repositories.AddressRepository;
import com.github.robsonsf.designpatternchallenge.repositories.ClientRepository;
import com.github.robsonsf.designpatternchallenge.services.IClientService;
import com.github.robsonsf.designpatternchallenge.services.IViaCepService;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private IViaCepService viaCepService;

	@Override
	@Transactional(readOnly = true)
	public Page<Client> findAllPaged(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client client = obj.get();
		return client;
	}

	@Override
	public void insert(Client client) {
		saveClientByCep(client);
	}

	@Override
	public void update(Long id, Client client) {
		Optional<Client> objClient = repository.findById(id);
		if(objClient.isPresent()) {
			saveClientByCep(client);
		}
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	private void saveClientByCep(Client client) {
		String cep = client.getAddress().getCep();
		Address address = addressRepository.findById(cep).orElseGet(() -> {
			Address newAddress = viaCepService.getCep(cep);
			addressRepository.save(newAddress);
			return newAddress;
		});
		client.setAddress(address);
		repository.save(client);
	}
}
