package com.example.exam1.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 50)
    private String name;


    @Column(length = 50)
    private String email;
    @Column
    private Post post;


        private String skills;

    @ManyToMany(mappedBy = "employes")
    private List<Project>projects=new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST, targetEntity =Implication.class)
    private List<Implication> implications;



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Implication> getImplication() {
        return implications;
    }

    public void setImplication(List<Implication> implications) {
        this.implications = implications;
    }



}


