package com.example.exam1.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 50)
    private String name;
    @Column
    private Double budget;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "project_employe",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employe_id"),
            uniqueConstraints = {
                    @UniqueConstraint(columnNames ={"project_id", "employe_id"})
            })
    private List<Employe> employes=new ArrayList<>();


    @OneToMany(cascade = CascadeType.PERSIST, targetEntity =Implication.class)
    private List<Implication> implication;

    public List<Implication> getImplication() {
        return implication;
    }

    public void setImplication(List<Implication> implication) {
        this.implication = implication;
    }

    public Project() {
    }

    public Project(String name, Double budget, List<Employe> employes) {
        this.name = name;
        this.budget = budget;
        this.employes = employes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}
