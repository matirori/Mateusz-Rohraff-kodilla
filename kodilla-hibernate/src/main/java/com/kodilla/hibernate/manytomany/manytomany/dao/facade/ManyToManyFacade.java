package com.kodilla.hibernate.manytomany.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public void save(Company company) {
        companyDao.save(company);
    }


    public List<Employee> searchEmployee(String findEmployee) {
        return employeeDao.retrievePeopleByName(findEmployee);
    }

    public List<Employee> searchEmployeeAny(String findEmployee){
        return employeeDao.retrieveWithAnyLettersLastname(findEmployee);
    }

    public List<Company> searchCompany(String findCompany) {
        return companyDao.retrieveCompaniesByFirstThreeLetters(findCompany);
    }

    public List<Company> searchCompanyAny(String findCompany) {
        return companyDao.retrieveWithAnyLetters(findCompany);
    }
}

