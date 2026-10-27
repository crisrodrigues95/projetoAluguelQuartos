package com.sistema.aluguel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estabelecimento")
public class Estabelecimento {
    

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idEstabelecimento")
    private Long idEstabelecimento;

    @Column (nullable = false, length = 10)
    private String cep;

    @Column (nullable = false, length = 200)
    private String endereco;

    @Column(nullable = true, length = 50 )
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

    @Column (nullable = true, columnDefinition = "TEXT")
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

    @Column (nullable = true)
    private Boolean apet;

    @Column (nullable = false)
    private Boolean internet;

    @ManyToOne
    @JoinColumn(name = "idLocador", referencedColumnName = "idLocador")
    private Locador locador;

    @Column (nullable = true, length = 1000)
    private String fotoPerfilCasa;

    public Long getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Long idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getQuartos() {
        return quartos;
    }

    public void setQuartos(Integer quartos) {
        this.quartos = quartos;
    }

    public Float getTamanhoCasa() {
        return tamanhoCasa;
    }

    public void setTamanhoCasa(Float tamanhoCasa) {
        this.tamanhoCasa = tamanhoCasa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getApOuCasa() {
        return apOuCasa;
    }

    public void setApOuCasa(Boolean apOuCasa) {
        this.apOuCasa = apOuCasa;
    }

    public Integer getVagasCarro() {
        return vagasCarro;
    }

    public void setVagasCarro(Integer vagasCarro) {
        this.vagasCarro = vagasCarro;
    }

    public Integer getComodos() {
        return comodos;
    }

    public void setComodos(Integer comodos) {
        this.comodos = comodos;
    }

    public Integer getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(Integer banheiros) {
        this.banheiros = banheiros;
    }

    public Integer getLavanderias() {
        return lavanderias;
    }

    public void setLavanderias(Integer lavanderias) {
        this.lavanderias = lavanderias;
    }

    public Boolean getApet() {
        return apet;
    }

    public void setApet(Boolean apet) {
        this.apet = apet;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Locador getLocador() {
        return locador;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public String getFotoPerfilCasa() {
        return fotoPerfilCasa;
    }

    public void setFotoPerfilCasa(String fotoPerfilCasa) {
        this.fotoPerfilCasa = fotoPerfilCasa;
    }
}
