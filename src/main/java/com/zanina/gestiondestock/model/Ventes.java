package com.zanina.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ventes")
public class Ventes extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "ventes")
    private List<LigneVente> ligneVentes;
}
