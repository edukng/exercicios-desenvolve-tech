package com.desenvolve.tech.exercicios.web.imoveis.entity;

public class Usuario {
    private String login;
    private String senha;
    private TipoDeUsuario tipo;

    public Usuario() {}

    public Usuario(String login, String senha, TipoDeUsuario tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoDeUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeUsuario tipo) {
        this.tipo = tipo;
    }
}
