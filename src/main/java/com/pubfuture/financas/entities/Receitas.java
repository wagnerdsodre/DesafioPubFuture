package com.pubfuture.financas.entities;

import com.pubfuture.financas.enums.TipoReceita;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Float valor;

    @Column(nullable = false)
    private LocalDate dataRecebimento;

    @Column(nullable = false)
    private LocalDate dataRecebimentoEsperado;

    @Column(nullable = false)
    private String descricao;

    @OneToOne
    @JoinColumn(name = "conta_id")
    private Contas conta;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoReceita tipo;

}
