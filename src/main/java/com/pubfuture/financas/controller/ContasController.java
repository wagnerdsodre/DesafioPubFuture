package com.pubfuture.financas.controller;

import com.pubfuture.financas.entities.Contas;
import com.pubfuture.financas.services.ContasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/contas/")
public class ContasController {


    @Autowired
    private ContasService service;

    @GetMapping
    public ResponseEntity<List<Contas>> findAll() {
        List<Contas> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/api/v1/contas/{id}")
    public ResponseEntity<Contas> findById(@PathVariable Long id) {
        Contas obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }






}
