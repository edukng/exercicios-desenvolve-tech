package com.desenvolve.tech.exercicios.web.imoveis.entity;

import com.desenvolve.tech.exercicios.web.imoveis.model.TipoDeImovel;
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
@Table(name = "imovel")
public class Imovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDoImovel;
    private TipoDeImovel tipoImovel;
    private String cidade;
    private float valor;
}
