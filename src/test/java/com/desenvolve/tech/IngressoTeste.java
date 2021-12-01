package com.desenvolve.tech;

import com.desenvolve.tech.exercicios.base.herancaepolimorfismo.exercicio3.Ingresso;

import java.util.Scanner;

public class IngressoTeste {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o tipo de ingresso: \n1- Ingresso Normal \n2- Ingresso VIP");

        if(entrada.nextInt() == 1){

        }
    }
}
