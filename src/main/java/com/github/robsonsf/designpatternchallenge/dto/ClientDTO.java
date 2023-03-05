package com.github.robsonsf.designpatternchallenge.dto;

import com.github.robsonsf.designpatternchallenge.entities.Client;

public class ClientDTO {
	private Long id;
	private String name;
	private AddressDTO addressDto;
	
	public ClientDTO(Client client) {
		this.name = client.getName();
		this.addressDto = new AddressDTO(client.getAddress());
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressDTO getAddressDto() {
		return addressDto;
	}
	public void setAddress(AddressDTO addressDto) {
		this.addressDto = addressDto;
	}
}
