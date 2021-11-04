package exercicios.herancaepolimorfismo.exercicio3;

import java.math.BigDecimal;

public class Vip extends Ingresso{
        private final BigDecimal taxa = new BigDecimal("100.00");

        public BigDecimal valorIngressoVip(){
                return getValorIngresso().add(taxa);
        }
}
