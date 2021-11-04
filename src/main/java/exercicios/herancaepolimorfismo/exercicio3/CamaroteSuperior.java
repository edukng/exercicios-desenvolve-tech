package exercicios.herancaepolimorfismo.exercicio3;

import java.math.BigDecimal;

public class CamaroteSuperior extends Vip{
    private final BigDecimal taxaSuperior = new BigDecimal("100.00");
    private final String localizacao = "Camarote inferior";

    public void imprimeTipoIngresso(){
        System.out.println("Ingresso normal");
    }
    public void imprimeLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }

    public BigDecimal valorIngressoSuperior(){
        return valorIngressoVip().add(taxaSuperior);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
