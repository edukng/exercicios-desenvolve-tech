package com.desenvolve.tech.exercicios.web.imoveis.entity;

public class Imovel {
    private String nomeDoImovel;
    private TipoDeImovel tipoImovel;
    private String cidade;
    private float valor;

    public Imovel() {}

    public Imovel(String nomeDoImovel, TipoDeImovel tipoImovel, String cidade, float valor) {
        this.nomeDoImovel = nomeDoImovel;
        this.tipoImovel = tipoImovel;
        this.cidade = cidade;
        this.valor = valor;
    }

    public String getNomeDoImovel() {
        return nomeDoImovel;
    }

    public void setNomeDoImovel(String nomeDoImovel) {
        this.nomeDoImovel = nomeDoImovel;
    }

    public TipoDeImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoDeImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
