package com.zanina.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zanina.gestiondestock.model.Categorie;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategorieDto {

    private Integer id;
    private String code;
    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    // mapping
    public static CategorieDto fromEntity(Categorie categorie) {
        if(categorie == null) {
            return null;
            // TODO throw an exception
        }
        return CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

    public static Categorie toEntity(CategorieDto categorieDto) {
        if(categorieDto == null) {
            return null;
            // TODO throw an exception
        }
        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorieDto.getCode());
        categorie.setDesignation(categorieDto.getDesignation());
        return categorie;
    }
}
