package com.jaymeholanda.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    Optional<Cliente> findByNome(String nome);

}
