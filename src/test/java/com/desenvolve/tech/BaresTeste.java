package com.desenvolve.tech;

import exercicios.classes.exercicio3.Bares;
import exercicios.classes.exercicio3.Cliente;
import exercicios.classes.exercicio3.Genero;

public class BaresTeste {
    public static void main(String[] args) {
        Bares matriz = new Bares();

        Cliente clienteDeTeste = new Cliente("1020304050", Genero.FEMININO);

        matriz.entradaCliente(clienteDeTeste);
        matriz.entradaCliente(new Cliente("3465434565", Genero.FEMININO));
        matriz.entradaCliente(new Cliente("6543522342", Genero.OUTRO));
        matriz.entradaCliente(new Cliente("2414534654", Genero.MASCULINO));
        matriz.entradaCliente(new Cliente("3214153676", Genero.OUTRO));
        matriz.entradaCliente(new Cliente("9867868969", Genero.MASCULINO));
        matriz.entradaCliente(new Cliente("2357897078", Genero.FEMININO));

        if(matriz.pesquisaClientePresente(clienteDeTeste)){
            System.out.println("Cliente Presente");
        }else{
            System.out.println("Cliente não está presente");
        }
    }
}
