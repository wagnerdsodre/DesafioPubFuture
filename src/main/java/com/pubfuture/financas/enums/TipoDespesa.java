package com.pubfuture.financas.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum TipoDespesa {
    ALIMENTACAO("Alimnetação"),
    LAZER("Lazer"),
    MORADIA("Moradia"),
    SAUDE("Saúde"),
    OUTROS("Outros");


    private final String description;
}


