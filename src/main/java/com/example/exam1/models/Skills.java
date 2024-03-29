package com.example.exam1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Skills {


    @Id
    private Long id;
    @Column
    private String skill;

    public Skills(String skill) {
        this.skill = skill;
    }

    public Skills() {
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
