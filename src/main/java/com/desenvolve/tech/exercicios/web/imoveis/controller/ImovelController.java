package com.desenvolve.tech.exercicios.web.imoveis.controller;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Imovel;
import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;
import com.desenvolve.tech.exercicios.web.imoveis.repository.ImoveisRepository;
import com.desenvolve.tech.exercicios.web.imoveis.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    ImovelService imoveis;

    @GetMapping()
    public List<Imovel> imoveis() {
        return imoveis.bancoDeImoveis();
    }

    @PostMapping("/cadastra")
    public ResponseEntity<Imovel> cadastraImovel(@RequestBody Imovel casa){
        return new ResponseEntity<>(imoveis.novoImovel(casa), HttpStatus.CREATED);
    }
}