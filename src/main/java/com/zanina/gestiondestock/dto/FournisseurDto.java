package com.zanina.gestiondestock.dto;

import com.zanina.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String mail;
    private String numTel;
    private List<CommandeFournisseurDto> commandeFournisseurs;

    private Integer idEntreprise;

    // mapping
    public static FournisseurDto fromEntity(Fournisseur fournisseur) {
        if(fournisseur == null) {
            return null;
            // TODO throw an exception
        }
        return FournisseurDto.builder()
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }

    public static Fournisseur toEntity(FournisseurDto dto) {
        if (dto == null) {
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(dto.getId());
        fournisseur.setNom(dto.getNom());
        fournisseur.setPrenom(dto.getPrenom());
        fournisseur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        fournisseur.setMail(dto.getMail());
        fournisseur.setNumTel(dto.getNumTel());
        fournisseur.setIdEntreprise(dto.getIdEntreprise());
        return fournisseur;
    }

}
