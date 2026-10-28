package com.sistema.aluguel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estabelecimento")
@Getter
@Setter
public class Estabelecimento {
    

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idEstabelecimento")
    @Setter(AccessLevel.NONE)
    private Long idEstabelecimento;

    @Column (nullable = false, length = 10)
    private String cep;

    @Column (nullable = false, length = 200)
    private String endereco;

    @Column(length = 50 )
    private String complemento;

    @Column (nullable = false, length = 200)
    private String bairro;

    @Column (nullable = false, length = 200)
    private String cidade;

    @Column (nullable = false, length = 2)
    private String estado;

    @Column (nullable = false)
    private Integer quartos;

    @Column (nullable = false)
    private Float tamanhoCasa;

    @Column (columnDefinition = "TEXT")
    private String descricao;

    @Column (nullable = false)
    private Boolean apOuCasa;

    @Column (nullable = false)
    private Integer vagasCarro;

    @Column (nullable = false)
    private Integer comodos;

    @Column (nullable = false)
    private Integer banheiros;

    @Column (nullable = false)
    private Integer lavanderias;

    @Column
    private Boolean apet;

    @Column (nullable = false)
    private Boolean internet;

    @ManyToOne
    @JoinColumn(name = "idLocador", referencedColumnName = "idLocador")
    private Locador locador;

    @Column (length = 1000)
    private String fotoPerfilCasa;
}
