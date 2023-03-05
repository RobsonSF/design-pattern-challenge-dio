package com.github.robsonsf.designpatternchallenge.dto;

public class ClientDTO {
	private Long id;
	private String name;
	private AddressDTO address;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
