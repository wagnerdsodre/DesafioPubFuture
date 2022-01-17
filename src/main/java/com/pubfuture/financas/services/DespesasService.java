package com.pubfuture.financas.services;

import com.pubfuture.financas.entities.Despesas;
import com.pubfuture.financas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesasService {

    @Autowired
    private DespesasRepository repository;

    public List<Despesas> findAll(){
        return repository.findAll();
    }

    public Despesas findById(Long id) {
        Optional<Despesas> obj = repository.findById(id);
        return obj.get();
    }


}
