package com.desenvolve.tech.exercicios.web.imoveis.service;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Imovel;
import com.desenvolve.tech.exercicios.web.imoveis.entity.TipoDeUsuario;
import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;

import java.util.List;

public class CadastroImovel {
    private List<Imovel> imoveis;

    public String cadastraImovel(Imovel novoImovel, Usuario usuario){
        if(usuario.getTipo() == TipoDeUsuario.LOCATARIO){
            return "Somente usuários Locadores podem cadastrar imóveis";
        }
        imoveis.add(novoImovel);
        return "Imóvel cadastrado";
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }
}
