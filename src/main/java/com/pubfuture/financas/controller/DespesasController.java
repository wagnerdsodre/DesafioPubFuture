package com.pubfuture.financas.controller;

import com.pubfuture.financas.entities.Despesas;
import com.pubfuture.financas.services.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/despesas/")
public class DespesasController {


    @Autowired
    private DespesasService service;

    @GetMapping
    public ResponseEntity<List<Despesas>> findAll() {
        List<Despesas> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/api/v1/despesas/{id}")
    public ResponseEntity<Despesas> findById(@PathVariable Long id) {
        Despesas obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }






}
