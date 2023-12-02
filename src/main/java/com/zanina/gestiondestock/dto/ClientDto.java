package com.zanina.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zanina.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;

    private String mail;
    private String numTel;

    private Integer idEntreprise;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    // mapping
    public static ClientDto fromEntity(Client client) {
        if(client == null) {
            return null;
            // TODO throw an exception
        }
        return ClientDto.builder()
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }
    public static Client toEntity(ClientDto dto) {
        if (dto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        client.setPhoto(dto.getPhoto());
        client.setMail(dto.getMail());
        client.setNumTel(dto.getNumTel());
        client.setIdEntreprise(dto.getIdEntreprise());
        return client;
    }


}
