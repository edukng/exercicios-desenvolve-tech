package exercicios.extras;

public class TriplaArranjo {
    public int procuraTriplas(int[] arranjoParametro, int numeroDaTripla){
        int contaTripla=0;
        for(int contador = 0; contador < arranjoParametro.length; contador++){
            if(numeroDaTripla == arranjoParametro[contador]){
                contaTripla++;
            }
        }
        return contaTripla;
    }
}
