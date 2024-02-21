package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyByFragmentOfName(String fragment){
        return companyDao.retriveFirstThreeLeters("%" + fragment + "%");
    }

    public List<Employee> findEmployeeByFragmentOfLastName(String fragment){
        return employeeDao.retrieveLastName("%" + fragment + "%");
    }

}
