package com.desenvolve.tech.exercicios.base.classes.exercicio3;

public class Cliente {
    private String cpf;
    private int idade;
    private Genero genero;

    public Cliente(String cpf, Genero genero) {
        this.cpf = cpf;
        this.genero = genero;
    }

    public Cliente(){}

    public Genero getGenero() {
        return genero;
    }
}
