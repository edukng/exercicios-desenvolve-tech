package com.desenvolve.tech.exercicios.base.extras;

public class ConcatenaString {
    String localString = "";

    public String repeteString(int parametroRepeticao, String parametroString) {

        for (int contador = 0; contador < parametroRepeticao; contador++) {
            localString = localString.concat(parametroString);
        }
        return localString;
    }
}
