package com.jaymeholanda.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{nome}")
    public Optional<Cliente> getByNome(@PathVariable String nome) {
        return clienteRepository.findByNome(nome);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{nome}")
    public void delete(@PathVariable String nome) {
        clienteRepository.deleteById(Long.valueOf(nome));
    }

}
