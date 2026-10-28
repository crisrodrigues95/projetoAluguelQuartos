
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
@Table(name = "foto")
@Getter
@Setter
public class Foto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoto")
    @Setter(AccessLevel.NONE)
    private Long idFoto;

    @Column(length = 1000, nullable = false)
    private String local;

    @ManyToOne
    @JoinColumn(name = "idQuarto", referencedColumnName = "idQuarto")
    private Quarto quarto;

    @ManyToOne
    @JoinColumn(name = "idEstabelecimento", referencedColumnName = "idEstabelecimento")
    private Estabelecimento estabelecimento;
}