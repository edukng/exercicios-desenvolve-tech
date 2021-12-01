package com.desenvolve.tech.exercicios.base.herancaepolimorfismo.exercicio2;

public class Gato extends Animal{

    public void mia(){
        System.out.println("Miando");
    }

    @Override
    public void caminha(){
        System.out.println("Gato Caminhando");
    }
}
