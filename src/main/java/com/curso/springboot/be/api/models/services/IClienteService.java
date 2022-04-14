package com.curso.springboot.be.api.models.services;

import java.util.List;

import com.curso.springboot.be.api.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);

}
