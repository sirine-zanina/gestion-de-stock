package com.zanina.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligne_commande_fournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;
}
