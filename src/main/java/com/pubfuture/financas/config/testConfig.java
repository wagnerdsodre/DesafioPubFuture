package com.pubfuture.financas.config;

import com.pubfuture.financas.entities.Contas;
import com.pubfuture.financas.enums.TipoConta;
import com.pubfuture.financas.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {

    @Autowired
    private ContasRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Contas c1 = new Contas(null,5622.0, TipoConta.CONTACORRENTE,"Banco do Brasil" );
        Contas c2 = new Contas(null,5622.0,TipoConta.POUPANCA,"Caixa Econômica" );
        repository.saveAll(Arrays.asList(c1,c2));
    }




}
