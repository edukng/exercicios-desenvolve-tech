package com.desenvolve.tech.exercicios.web.imoveis.entity;

import com.desenvolve.tech.exercicios.web.imoveis.model.TipoDeUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String senha;
    private TipoDeUsuario tipo;
}
