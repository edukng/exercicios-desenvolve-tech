package com.desenvolve.tech;

import exercicios.herancaepolimorfismo.exercicio2.Animal;
import exercicios.herancaepolimorfismo.exercicio2.Cachorro;
import exercicios.herancaepolimorfismo.exercicio2.Gato;

public class AnimalTeste {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        cachorro.late();
        gato.mia();
        gato.caminha();
        cachorro.caminha();
    }
}
