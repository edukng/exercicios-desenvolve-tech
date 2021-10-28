package exercicios.aula1;

public class Application {
    private static int [] primeiroArranjoInteiros;
    private static int [] segundoArranjoInteiros;

    public static void main(String[] args) {
        primeiroArranjoInteiros = new int [20];
        segundoArranjoInteiros = new int [20];

        for (int contador = 0; contador < primeiroArranjoInteiros.length; contador++) {
            multiplica(primeiroArranjoInteiros, contador);
            multiplica(segundoArranjoInteiros, contador);
            imprimeResultado(primeiroArranjoInteiros, contador);
        }

        for (int contador = primeiroArranjoInteiros.length - 1; contador >= 0; contador--) {
            imprimeResultado(primeiroArranjoInteiros, contador);
        }

        System.out.println("\nNúmero de Ocorrências de um elemento: " + numeroDeOcorrencias(primeiroArranjoInteiros, 20));

        if(numeroRepetido(primeiroArranjoInteiros)){
            System.out.println("Há números repetidos");
        }else{
            System.out.println("Não há números repetidos");
        }

        System.out.println("Número de números repetidos no arranjo: " + contaNumerosRepetidos(primeiroArranjoInteiros));
        System.out.println("União de Arranjos: " + Arrays.toString(uneArranjos(primeiroArranjoInteiros, segundoArranjoInteiros)));
    }

    static int multiplica(int[] entradaArranjos, int posicaoArranjo) {
        return entradaArranjos[posicaoArranjo] = posicaoArranjo * 10;
    }

    static void imprimeResultado(int[] params, int posicaoArranjo) {
        System.out.println("Resultado da multiplicação: " + params[posicaoArranjo]);
    }

    public static int numeroDeOcorrencias(int[] params, Integer elemento) {
        int contaOcorrencias = 0;

        for (int contador = 0; contador < primeiroArranjoInteiros.length; contador++) {
            if (params[contador] == elemento) {
                contaOcorrencias++;
            }
        }
        return contaOcorrencias;
    }

    public static boolean numeroRepetido(int[] params){
        boolean estado = false;
        for(int contador = 0; contador < primeiroArranjoInteiros.length; contador++){
            for(int conta = 0; conta < contador; conta++){
                if (params[contador] == params[conta]) {
                    estado = true;
                    break;
                }
            }
        }
        return estado;
    }

    public static int contaNumerosRepetidos(int[] params){
        int contaRepetidos = 0;
        for(int contador = 0; contador < primeiroArranjoInteiros.length; contador++){
            for(int conta = 0; conta < contador; conta++){
                if (params[contador] == params[conta]) {
                    contaRepetidos++;
                }
            }
        }
        return contaRepetidos;
    }

    public static int [] uneArranjos(int [] primeiroArranjo, int [] segundoArranjo){
        int [] retornoUniao = new int[40];
        int contadorAuxiliar = 0;
        for(int contador = 0; contador < retornoUniao.length;contador++){
            if(contador == 20){
                contadorAuxiliar = 0;
            }
            if(contador < 20){
                retornoUniao[contador] = primeiroArranjo[contadorAuxiliar];
            }
            if(contador > 20){
                retornoUniao[contador] = segundoArranjo[contadorAuxiliar];
            }

            contadorAuxiliar++;
        }
        return retornoUniao;
    }
}
