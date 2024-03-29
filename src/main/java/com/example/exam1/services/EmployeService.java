package com.example.exam1.services;

import com.example.exam1.models.Employe;
import com.example.exam1.models.Project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeService {

    public List<Employe> getAllEmployees(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eclipse-link");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        Query query=entityManager.createQuery("select e from  Employe e");

        return  query.getResultList();

    }

    public List<Project> getEmployeProjects() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eclipse-link");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        Query query=entityManager.createQuery("select e.projects from  Employe e ");


       return query.getResultList();




    }

}
