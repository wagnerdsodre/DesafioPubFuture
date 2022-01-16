package com.pubfuture.financas.controller;

import com.pubfuture.financas.dto.MessegeResponseDTO;
import com.pubfuture.financas.entities.Contas;
import com.pubfuture.financas.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/contas/")
public class ContasController {


    @Autowired
    private ContasRepository repository;

     public ContasController(ContasRepository repository) {
        this.repository = repository;
    }

   public MessegeResponseDTO CreateAccount(@RequestBody  Contas conta){
         Contas saveconta  =  repository.save(conta);
         return MessegeResponseDTO
                 .builder()
                 .messege("Created account with id" + saveconta.getId())
                 .build();

   }

}
