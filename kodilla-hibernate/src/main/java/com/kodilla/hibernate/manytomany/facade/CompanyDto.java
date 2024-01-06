package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public final class CompanyDto {
    private final Long companyId;
    private final String companyName;
    private final List<EmployeeDto> employeeList = new ArrayList<>();

    public CompanyDto(Long companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<EmployeeDto> getEmployeeList() {
        return employeeList;
    }
}
