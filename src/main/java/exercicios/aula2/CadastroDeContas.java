package exercicios.aula2;

import java.util.ArrayList;

public class CadastroDeContas {
    private ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();
    private int numeroContaCorrente = 0;

    public boolean cadastraNovaConta(ContaCorrente contaParametro) {
        if (contaParametro.getSaldo() != null) {
            contaCorrente.add(contaParametro);
            numeroContaCorrente += 1;
            return true;
        }
        return false;
    }

    public ContaCorrente pesquisaConta(int numeroConta) {
        if (contaCorrente.isEmpty()) {
            return null;
        }

        return contaCorrente.get(numeroConta);
    }

    public ArrayList<ContaCorrente> getContaCorrente() {
        return contaCorrente;
    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }
}
