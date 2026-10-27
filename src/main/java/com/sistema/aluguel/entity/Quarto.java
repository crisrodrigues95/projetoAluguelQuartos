package com.sistema.aluguel.entity;
import java.math.BigDecimal;

import com.sistema.aluguel.enuns.Disponibilidade;

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
import lombok.Data;

@Data
@Entity
@Table(name = "quarto")
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuarto;

    @Column(name = "tamanhoQuarto", nullable = false)
    private Float tamanhoQuarto;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "mobiliado", nullable = false)
    private Boolean mobiliado;

    @Column(name = "negociavel", nullable = false)
    private Boolean negociavel;

    @Column(name = "descricao", nullable = true, columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "quantidadeTomada", nullable = false)
    private Integer quantidadeTomada;

    @Column(name = "arCondicionado", nullable = false)
    private Boolean arCondicionado;

    @ManyToOne
    @JoinColumn(name  = "idEstabelecimento", referencedColumnName = "idEstabelecimento") 
    private Estabelecimento estabelecimento;

    @Enumerated (EnumType.STRING)
    @Column(name = "disponibilidade", nullable = true, length = 20)
    private Disponibilidade disponibilidade;


    @Column (name = "fotoPerfilQuarto", nullable = true, length = 1000)
    private String fotoPerfilQuarto;

    public Long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Float getTamanhoQuarto() {
        return tamanhoQuarto;
    }

    public void setTamanhoQuarto(Float tamanhoQuarto) {
        this.tamanhoQuarto = tamanhoQuarto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean getMobiliado() {
        return mobiliado;
    }

    public void setMobiliado(Boolean mobiliado) {
        this.mobiliado = mobiliado;
    }

    public Boolean getNegociavel() {
        return negociavel;
    }

    public void setNegociavel(Boolean negociavel) {
        this.negociavel = negociavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeTomada() {
        return quantidadeTomada;
    }

    public void setQuantidadeTomada(Integer quantidadeTomada) {
        this.quantidadeTomada = quantidadeTomada;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getFotoPerfilQuarto() {
        return fotoPerfilQuarto;
    }

    public void setFotoPerfilQuarto(String fotoPerfilQuarto) {
        this.fotoPerfilQuarto = fotoPerfilQuarto;
    }
}
