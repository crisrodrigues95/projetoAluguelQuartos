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

@Entity
@Table(name = "locador")

public class Locador {





    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocador;

    @Column(name = "nomeCompleto", nullable = false, length = 150)
    private String nomeCompleto;

    
    @Column(name = "cpf", nullable = false, length = 20)
    @CPF
    private String cpf;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "email", nullable = false, length = 150)
    @Email
    private String email;

    @Column(name = "senha", nullable = false, length = 12)
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

    @Column(name = "temCarro", nullable = true)
    private Boolean temCarro;

    @Column(name = "temVeiculo", nullable = true)
    private Boolean temVeiculo;

    @Column(name = "cozinha", nullable = false)
    private Boolean cozinha;

    public Long getIdLocador() {
        return idLocador;
    }

    public void setIdLocador(Long idLocador) {
        this.idLocador = idLocador;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getFumante() {
        return fumante;
    }

    public void setFumante(Boolean fumante) {
        this.fumante = fumante;
    }

    public Boolean getPet() {
        return pet;
    }

    public void setPet(Boolean pet) {
        this.pet = pet;
    }

    public Integer getQuantPet() {
        return quantPet;
    }

    public void setQuantPet(Integer quantPet) {
        this.quantPet = quantPet;
    }

    public Boolean getVegano() {
        return vegano;
    }

    public void setVegano(Boolean vegano) {
        this.vegano = vegano;
    }

    public Boolean getVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(Boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public Boolean getTemCarro() {
        return temCarro;
    }

    public void setTemCarro(Boolean temCarro) {
        this.temCarro = temCarro;
    }

    public Boolean getTemVeiculo() {
        return temVeiculo;
    }

    public void setTemVeiculo(Boolean temVeiculo) {
        this.temVeiculo = temVeiculo;
    }

    public Boolean getCozinha() {
        return cozinha;
    }

    public void setCozinha(Boolean cozinha) {
        this.cozinha = cozinha;
    }

}   