package com.pubfuture.financas.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum TipoConta {
    CARTEIRA("Carteira"),
    CONTACORRENTE("Conta-Corrente"),
    POUPANCA("Poupança");

    private final String description;
}


