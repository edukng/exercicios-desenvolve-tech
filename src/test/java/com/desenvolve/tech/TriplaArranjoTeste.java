package com.desenvolve.tech;

import exercicios.extras.TriplaArranjo;

public class TriplaArranjoTeste {
    public static void main(String[] args) {
        int numeroTrila = 6;
        int[] arranjo = {0,1,2,3,4,5,6,6,6,67,8,9,};
        TriplaArranjo triplaTeste = new TriplaArranjo();

        System.out.println("Número de tripla no arranjo: " + triplaTeste.procuraTriplas(arranjo,numeroTrila));

    }
}
