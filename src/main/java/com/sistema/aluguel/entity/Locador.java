package com.sistema.aluguel.entity;


import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locador")
@Getter
@Setter
public class Locador {





    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idLocador;

    @Column(name = "nomeCompleto", nullable = false, length = 150)
    private String nomeCompleto;

    
    @Column(name = "cpf", nullable = false, unique = true, length = 20)
    @CPF
    private String cpf;

    @Column(name = "telefone", nullable = false, unique = true, length = 15)
    private String telefone;

    @Column(name = "email", nullable = false, unique = true, length = 150)
    @Email
    private String email;

    @Column(name = "senha", nullable = false, length = 12)
    @Getter(AccessLevel.NONE)
    private String senha;

    @Column(name = "dataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;

    @Column(name = "fumante", nullable = false)
    private Boolean fumante;

    @Column(name = "pet", nullable = false)
    private Boolean pet;

    @Column(name = "quantPet", nullable = false)
    private Integer quantPet;

    @Column(name = "vegano", nullable = false)
    private Boolean vegano;
    
    @Column(name = "vegetariano", nullable = false)
    private Boolean vegetariano;

    @Column(length = 200)
    private String faculdade;

    @Column(length = 200)
    private String trabalho;

    @Column(name = "temCarro")
    private Boolean temCarro;

    @Column(name = "temVeiculo")
    private Boolean temVeiculo;

    @Column(name = "cozinha", nullable = false)
    private Boolean cozinha;
}