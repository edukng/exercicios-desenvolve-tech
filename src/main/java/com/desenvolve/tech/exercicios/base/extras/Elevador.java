package com.desenvolve.tech.exercicios.base.extras;

public class Elevador {
    private int andarAtual = 0;
    private int totalDeAndares = 0;
    private int capacidadeDoElevador = 0;

    public void tipoDoElevador(int parametroDaCapacidade, int quantidadeDeAndares) {
        setCapacidadeDoElevador(parametroDaCapacidade);
        setTotalDeAndares(quantidadeDeAndares);
    }

    public boolean entra() {
        int contaCapacidade = 0;
        setCapacidadeDoElevador(getCapacidadeDoElevador() - 1);
        return getCapacidadeDoElevador() >= contaCapacidade;
    }

    public boolean sai() {
        if (capacidadeDoElevador != 0) {
            setCapacidadeDoElevador(getCapacidadeDoElevador() + 1);
            return true;
        }
        return false;
    }

    public boolean sobe(int parametroAndar) {
        if(getAndarAtual() <= getTotalDeAndares()){
            setAndarAtual(parametroAndar);
            return true;
        }
        return false;
    }

    public boolean desce(int parametroAndar){
        if(getAndarAtual() >= 0){
            setAndarAtual(parametroAndar);
            return true;
        }
        return false;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
}
