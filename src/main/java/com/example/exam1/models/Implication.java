package com.example.exam1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Implication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer valeur ;

    public Implication(Integer valeur) {
        this.valeur = valeur;
    }

    public Implication() {

    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
