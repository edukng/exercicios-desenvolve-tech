package exercicios.aula2.exercicio3;

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

    public int porcentagemGenero(Cliente generosParametro){
        int total = clientes.size();

        if (clientes.contains(generosParametro)) {

        }
    }
}
