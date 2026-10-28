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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "quarto")
@Getter
@Setter
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idQuarto;

    @Column(name = "tamanhoQuarto", nullable = false)
    private Float tamanhoQuarto;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "mobiliado", nullable = false)
    private Boolean mobiliado;

    @Column(name = "negociavel", nullable = false)
    private Boolean negociavel;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "quantidadeTomada", nullable = false)
    private Integer quantidadeTomada;

    @Column(name = "arCondicionado", nullable = false)
    private Boolean arCondicionado;

    @ManyToOne
    @JoinColumn(name  = "idEstabelecimento", referencedColumnName = "idEstabelecimento") 
    private Estabelecimento estabelecimento;

    @Enumerated (EnumType.STRING)
    @Column(name = "disponibilidade", length = 20)
    private Disponibilidade disponibilidade;


    @Column (name = "fotoPerfilQuarto", length = 1000)
    private String fotoPerfilQuarto;
    
}
