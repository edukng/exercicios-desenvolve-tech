package exercicios.classes.exercicio3;

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
        int total = clientes.size();
        long fequency = clientes.stream().filter(gearInput -> gearInput.getGenero().equals(Genero.FEMININO)).count();


        return total;
    }
}
