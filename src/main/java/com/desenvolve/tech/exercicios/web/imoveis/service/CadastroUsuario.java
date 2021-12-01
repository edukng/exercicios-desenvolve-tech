package com.desenvolve.tech.exercicios.web.imoveis.service;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;

import java.util.List;

public class CadastroUsuario {
    private List<Usuario> bancoDeUsuarios;

    public void adicionaUsuario(Usuario novoUsuario) {
        bancoDeUsuarios.add(novoUsuario);
    }

    public List<Usuario> getBancoDeUsuarios() {
        return bancoDeUsuarios;
    }
}
