package exercicios.herancaepolimorfismo.exercicio3;

public class CamaroteInferior extends Vip{
    private final String localizacao = "Camarote inferior";

    public void imprimeTipoIngresso(){
        System.out.println("Ingresso normal");
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
