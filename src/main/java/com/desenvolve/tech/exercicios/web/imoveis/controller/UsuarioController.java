package com.desenvolve.tech.exercicios.web.imoveis.controller;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;
import com.desenvolve.tech.exercicios.web.imoveis.service.CadastroUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {


    @PostMapping("/novousuario")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraUsuario(@RequestBody Usuario usuario) {
        CadastroUsuario novoUsuario = new CadastroUsuario();
        novoUsuario.adicionaUsuario(usuario);
    }
}
