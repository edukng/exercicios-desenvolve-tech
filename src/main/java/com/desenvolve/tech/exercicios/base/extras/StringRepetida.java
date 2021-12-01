package com.desenvolve.tech.exercicios.base.extras;

public class StringRepetida {

    public int verificaRepeticaoDeStrings(String primeiraString, String segundaString) {
        if (primeiraString.contains(segundaString)) {
            String[] repetidas = primeiraString.split(segundaString);
            return repetidas.length;
        }
        return 0;
    }
}
