package com.desenvolve.tech;

import exercicios.aula2.exercicio3.Bares;
import exercicios.aula2.exercicio3.Cliente;
import exercicios.aula2.exercicio3.Genero;

public class BaresTeste {
    public static void main(String[] args) {
        Bares matriz = new Bares();

        Cliente clienteDeTeste = new Cliente("1020304050", Genero.FEMININO);

        matriz.entradaCliente(clienteDeTeste);

        if(matriz.pesquisaClientePresente(clienteDeTeste)){
            System.out.println("Cliente Presente");
        }else{
            System.out.println("Cliente não está presente");
        }
    }
}
