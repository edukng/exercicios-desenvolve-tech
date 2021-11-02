package exercicios.aula2.exercicio1e2;

public class ContaCorrente {

    private Double saldo;
    private int conta;

    public ContaCorrente(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(Double valor) {
        if(valor > 0){
            conta += valor;
        }
    }

    public double retirada(Double valor) {
        if(valor > saldo){
            return valor -= saldo;
        }
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }
}