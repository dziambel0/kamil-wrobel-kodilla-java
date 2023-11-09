package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
@NamedQuery(name = "Company.retriveFirstThreeLeters", query = "FROM Company WHERE SUBSTRING(name, 1, 3) = :NAME ")
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employeeList = new ArrayList<>();

    public Company(){
    }

    public Company(String name) {
        this.name = name;
    }
@Id
@GeneratedValue
@NonNull
@Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }
@NonNull
@Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }
@ManyToMany(cascade = CascadeType.ALL, mappedBy = "companyList")
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
