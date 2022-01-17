package com.pubfuture.financas.services;

import com.pubfuture.financas.entities.Contas;
import com.pubfuture.financas.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContasService {

    @Autowired
    private ContasRepository repository;

    public List<Contas> findAll(){ return repository.findAll(); }


    public Contas findById(Long id) {
        Optional<Contas> obj = repository.findById(id);
        return obj.get();
    }



}
