package com.desenvolve.tech.exercicios.web.imoveis.service;


import com.desenvolve.tech.exercicios.web.imoveis.entity.Imovel;
import com.desenvolve.tech.exercicios.web.imoveis.repository.ImoveisRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImovelService {

    @Autowired
    ImoveisRepository imovel;

    public List<Imovel> bancoDeImoveis(){
        return imovel.findAll();
    }

    public Imovel novoImovel(Imovel casa){
        return imovel.save(casa);
    }
}
