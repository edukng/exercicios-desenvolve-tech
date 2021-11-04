package exercicios.herancaepolimorfismo.exercicio3;

import java.math.BigDecimal;

public class Ingresso {
    private final BigDecimal valorIngresso = new BigDecimal("100.00");

    public void imprimeValor(){
    }

    public BigDecimal getValorIngresso() {
        return valorIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valorIngresso=" + valorIngresso +
                '}';
    }
}
