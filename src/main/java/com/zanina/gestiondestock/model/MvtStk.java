package com.zanina.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity{

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;

    @Column(name = "sourcemvt")
    private SourceMvtStk sourceMvt;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;





}
