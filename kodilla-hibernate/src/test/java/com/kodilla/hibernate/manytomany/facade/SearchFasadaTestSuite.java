package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class SearchFasadaTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void tesyFindCompanyByFragmentOfName(){
        //Given
        Company company1 = new Company("Nazwa firmy ABC");
        Company company2 = new Company("Nazwa firmy XYZ");
        companyDao.save(company1);
        companyDao.save(company2);

        //When
        List<Company> companies = facade.findCompanyByFragmentOfName("ABC");

        //Then
        //assertEquals(1,companies.size());
        //assertTrue(companies.contains(company1));
    }
    @Test
    void testFindEmployeeByFragmentOfLastName() {
        // Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Tomasz", "Nowak");
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        // When
        List<Employee> employees = facade.findEmployeeByFragmentOfLastName("Nowak");

        // Then
        //assertEquals(1, employees.size());
        //assertTrue(employees.contains(employee2));
    }

}
