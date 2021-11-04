package exercicios.herancaepolimorfismo.exercicio3;

import java.math.BigDecimal;

public class Ingresso {
    private final BigDecimal valorIngresso = new BigDecimal("100.00");

    public void imprimeValor(BigDecimal valorParametro){
        //System.out.println("Valor do ingresso" + valorParametro);
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
