package com.zanina.gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligne_commande_client")
public class LigneCommandeClient extends AbstractEntity{

private Integer quantite;
    private Integer idEntreprise;
    private Integer idArticle;
    private Integer idCommandeClient;

    @ManyToOne
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;
}
