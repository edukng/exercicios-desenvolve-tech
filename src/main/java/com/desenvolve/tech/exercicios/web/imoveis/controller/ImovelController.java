package com.desenvolve.tech.exercicios.web.imoveis.controller;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Imovel;
import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;
import com.desenvolve.tech.exercicios.web.imoveis.service.CadastroImovel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    CadastroImovel imoveis = new CadastroImovel();

    @GetMapping("/todosimoveis")
    public List<Imovel> imoveis() {
        return imoveis.getImoveis();
    }

    @PostMapping("/cadastra")
    public void cadastro(@RequestBody Imovel imovel, Usuario usuario) {
        CadastroImovel novoImovel = new CadastroImovel();
        novoImovel.cadastraImovel(imovel, usuario);
    }
}