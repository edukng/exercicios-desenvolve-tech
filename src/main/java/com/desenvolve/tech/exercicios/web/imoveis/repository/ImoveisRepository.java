package com.desenvolve.tech.exercicios.web.imoveis.repository;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImoveisRepository extends JpaRepository <Imovel, Long >{
}
