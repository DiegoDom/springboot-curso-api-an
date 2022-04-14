package com.curso.springboot.be.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.curso.springboot.be.api.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
