package com.desenvolve.tech.exercicios.web.imoveis.repository;

import com.desenvolve.tech.exercicios.web.imoveis.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
