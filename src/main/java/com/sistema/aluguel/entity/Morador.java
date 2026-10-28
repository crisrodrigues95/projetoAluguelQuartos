package com.sistema.aluguel.entity;

import java.time.LocalDate;

import com.sistema.aluguel.enuns.Sexo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "moradores")
@Getter
@Setter
public class Morador {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idMorador")
    @Setter(AccessLevel.NONE)
    private Long idMorador;

    @Column (name = "nomeCompleto", nullable = false, length = 150)
    private String nomeCompleto;

    @Column (name = "cpf", nullable = false, unique = true, length = 20)
    private String cpf;

    @Column (name = "telefone", nullable = false, unique = true, length = 15)
    private String telefone;

    @Column (name = "email", nullable = false, unique = true, length = 150)
    private String email;

    @Column (name = "senha", nullable = false, length = 12)
    @Getter(AccessLevel.NONE)
    private String senha;

    @Column (name = "dataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Enumerated (EnumType.STRING)
    @Column (name = "sexo", nullable = false, length = 10)
    private Sexo sexo;

    @Column (name = "fumante", nullable = false)
    private Boolean fumante;

    @Column (name = "pet", nullable = false)
    private Boolean pet;

    @Column (name = "quantPet")
    private Integer quantPet;

    @Column (name = "vegano", nullable = false)
    private Boolean vegano;

    @Column (name = "vegetariano", nullable = false)
    private Boolean vegetariano;
    
    @Column (name = "faculdade", length = 200)
    private String faculdade;

    @Column (name = "trabalho", length = 200)
    private String trabalho;
    
    @Column (name = "temCarro", nullable = false)
    private Boolean temCarro;

    @Column (name = "temVeiculo", nullable = false)
    private Boolean temVeiculo;

    @Column (name = "cozinha", nullable = false)
    private Boolean cozinha;

    @ManyToOne
    @JoinColumn(name = "idQuarto", referencedColumnName = "idQuarto")
    private Quarto quarto;
}
