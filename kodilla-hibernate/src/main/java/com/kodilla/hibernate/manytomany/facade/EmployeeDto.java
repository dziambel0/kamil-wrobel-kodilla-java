package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeDto {

    private final Long employeeId;
    private final String employeeName;
    private final String employeeLastName;
    private final List<CompanyDto> companyList = new ArrayList<>();

    public EmployeeDto(Long employeeId, String employeeName, String employeeLastName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public List<CompanyDto> getCompanyList() {
        return companyList;
    }
}
