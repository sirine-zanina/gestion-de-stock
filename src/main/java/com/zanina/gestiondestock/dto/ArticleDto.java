package com.zanina.gestiondestock.dto;

import com.zanina.gestiondestock.model.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;
    private String photo;
    private CategorieDto categorie;

    // mapping
    public static ArticleDto fromEntity(Article article) {
        if(article == null) {
            return null;
            // TODO throw an exception
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .categorie(CategorieDto.fromEntity(article.getCategorie()))
                .build();
    }

    public static Article toEntity(ArticleDto articleDto) {
        if(articleDto == null) {
            return null;
            // TODO throw an exception
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setPhoto(articleDto.getPhoto());
        article.setCategorie(CategorieDto.toEntity(articleDto.getCategorie()));
        return article;
    }


}
