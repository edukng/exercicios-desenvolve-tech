package com.desenvolve.tech;

import exercicios.herancaepolimorfismo.exercicio1.Assistente;
import exercicios.herancaepolimorfismo.exercicio1.Funcionario;
import exercicios.herancaepolimorfismo.exercicio1.Tecnico;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario assistente = new Assistente();
        Tecnico tecnico = new Tecnico();

        assistente.setNome("Maria");
        assistente.setNumeroDeMatricula("324567865433");
        tecnico.setNome("Isabela");
        tecnico.setNumeroDeMatricula("32456787654");

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Número matricula: " + assistente.getNumeroDeMatricula());
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("Número matricula: " + tecnico.getNumeroDeMatricula());

    }
}
