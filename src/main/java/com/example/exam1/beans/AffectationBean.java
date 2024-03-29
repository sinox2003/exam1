package com.example.exam1.beans;

import com.example.exam1.models.Employe;
import com.example.exam1.models.Project;
import com.example.exam1.services.EmployeService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "affectationBean")
public class AffectationBean {

    EmployeService employeService=new EmployeService();
    Employe employe;

    static int i=0;
    public  String getEmploye(){
         employe=employeService.getAllEmployees().get(Math.min(Math.max(0,i),Math.min(i,employeService.getAllEmployees().size())));
        return employe.getName();
    }

    public void addOneToI(){
        i++;
    }
    public void subOneToI(){
        i++;
    }


    public List<String> getEmployeProjects() {
        List<Project> projects=employeService.getEmployeProjects();
        System.out.println(projects);
        
        return projects;

    }


}
