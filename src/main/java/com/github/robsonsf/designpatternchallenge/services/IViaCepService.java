package com.github.robsonsf.designpatternchallenge.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.robsonsf.designpatternchallenge.entities.Address;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IViaCepService {
	
	@GetMapping("/{cep}/json/")
	Address getCep(@PathVariable("cep") String cep);
}
