package exercicios.herancaepolimorfismo.exercicio3;

public class CamaroteInferior extends Vip{
    private final String localizacao = "Camarote inferior";

    public void imprime(){
        System.out.println("Localização: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
