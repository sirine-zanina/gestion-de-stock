package com.zanina.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ChangerMotDePasseUtilisateurDto {

    private Integer id;
    private String motDePasse;
    private String confirmerMotDePasse;
}
