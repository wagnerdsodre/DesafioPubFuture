package com.pubfuture.financas.repository;

import com.pubfuture.financas.entities.Contas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasRepository extends JpaRepository<Contas, Long> {
}
