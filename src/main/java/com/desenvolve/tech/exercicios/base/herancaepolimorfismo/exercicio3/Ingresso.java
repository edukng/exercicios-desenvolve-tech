package com.desenvolve.tech.exercicios.base.herancaepolimorfismo.exercicio3;

import java.math.BigDecimal;

public class Ingresso {
    private final BigDecimal valorIngresso = new BigDecimal("100.00");

    public BigDecimal getValorIngresso() {
        return valorIngresso;
    }

    public String imprimeValor() {
        return "Ingresso{" +
                "valorIngresso=" + valorIngresso +
                '}';
    }
}
