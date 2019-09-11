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


    public List<Employee> searchEmployee(String findEmployee) throws ManyToManyException {
        List<Employee> lastname = employeeDao.retrievePeopleByName(findEmployee);
        if(findEmployee.isEmpty()) {
            throw new ManyToManyException(ManyToManyException.ERR_SEARCHEMPLOYEE_ERROR);
        }
        return lastname;
    }

    public List<Employee> searchEmployeeAny(String findEmployee) throws ManyToManyException {
        List<Employee> lastname = employeeDao.retrieveWithAnyLettersLastname(findEmployee);
        if(findEmployee.isEmpty()) {
            throw new ManyToManyException(ManyToManyException.ERR_SEARCHEMPLOYEE_ERROR);
        }
        return lastname;
    }

    public List<Company> searchCompany(String findCompany) throws ManyToManyException {
        List<Company> threeFirstLetters = companyDao.retrieveCompaniesByFirstThreeLetters(findCompany);
        if(threeFirstLetters.size()<1) {
            throw new ManyToManyException(ManyToManyException.ERR_SEARCHCOMPANY_ERROR);
        }
        return threeFirstLetters;
    }

    public List<Company> searchCompanyAny(String findCompany) throws ManyToManyException {
        List<Company> anyLetters = companyDao.retrieveWithAnyLetters(findCompany);
        if(anyLetters.size()<1) {
            throw new ManyToManyException(ManyToManyException.ERR_SEARCHCOMPANY_ERROR);
        }
        return anyLetters;
    }
}

