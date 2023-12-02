package com.zanina.gestiondestock.dto;

import com.zanina.gestiondestock.model.CommandeFournisseur;
import com.zanina.gestiondestock.model.EtatCommande;
import com.zanina.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private FournisseurDto fournisseur;
    private Integer idEntreprise;
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .etatCommande(commandeFournisseur.getEtatCommande())
                .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
                .idEntreprise(commandeFournisseur.getIdEntreprise())
                .build();

    }

    public static CommandeFournisseur toEntity(CommandeFournisseurDto dto) {
        if (dto == null) {
            return null;
        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(dto.getId());
        commandeFournisseur.setCode(dto.getCode());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(dto.getFournisseur()));
        commandeFournisseur.setDateCommande(dto.getDateCommande());
        commandeFournisseur.setEtatCommande(dto.getEtatCommande());
        commandeFournisseur.setIdEntreprise(dto.getIdEntreprise());
        return commandeFournisseur;
    }

    public boolean isCommandeLivree() {
        return EtatCommande.LIVREE.equals(this.etatCommande);
    }



}
