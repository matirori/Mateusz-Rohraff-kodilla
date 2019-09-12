package com.kodilla.hibernate.manytomany;

import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.retrieveCompaniesByFirstThreeLetters",
                query = "SELECT LEFT (COMPANY_NAME, 3) COMPANY_CODE FROM COMPANIES" +
                        " WHERE COMPANY_CODE LIKE :COMPANY_CODE",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.retrieveWithAnyLetters",
                query = "SELECT * FROM COMPANIES" +
                        " WHERE COMPANY_NAME LIKE CONCAT('%', :ARG ,'%')",
                resultClass = Company.class
        )
})

@Service
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
