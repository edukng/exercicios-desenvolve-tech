package com.desenvolve.tech.exercicios.base.classes.exercicio3;

import java.util.ArrayList;

public class Bares {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void entradaCliente(Cliente novoCliente){
        clientes.add(novoCliente);
    }

    public void saidaCliente(Cliente clientePresente){
        clientes.remove(clientePresente);
    }

    public boolean pesquisaClientePresente(Cliente clienteParametro){
        return clientes.contains(clienteParametro);
    }

    public long porcentagemGenero(Genero clienteGenero){
        long total = 0;
        long contaGenero = clientes.stream().filter(genero -> genero.getGenero().equals(Genero.FEMININO)).count();


        return total * contaGenero ;
    }
}
