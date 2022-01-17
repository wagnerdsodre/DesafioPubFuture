package com.pubfuture.financas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoReceita {
    SALARIO("Salário"),
    PRESENTE("Presente"),
    PREMIO("Prêmio"),
    OUTROS("Outros");


    private final String description;
}


