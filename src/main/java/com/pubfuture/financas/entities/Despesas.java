package com.pubfuture.financas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Float valor;

    @Column(nullable = false)
    private LocalDate dataPagamento;

    @Column(nullable = false)
    private LocalDate dataPagamentoEsperado;

    @OneToOne
    @JoinColumn(name = "conta_id")
    private Contas conta;

}
