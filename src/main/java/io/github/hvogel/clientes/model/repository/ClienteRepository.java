package io.github.hvogel.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.hvogel.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


	
}
