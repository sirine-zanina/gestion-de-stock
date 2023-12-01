package com.zanina.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "categorie")
public class Categorie extends AbstractEntity{
    
    @Column(name= "code")
    private String code;

    @Column(name= "designation")
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
