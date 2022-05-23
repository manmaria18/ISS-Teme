package com.example.monitorisingemployees.repository;

import com.example.monitorisingemployees.domain.Employee;

import java.util.List;

public class RepositoryEmployee implements IRepositoryEmployee{
    private JdbcUtils jdbcUtils;

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void modify(Employee employee) {

    }

    @Override
    public List<Employee> findAllEmployees() {
        return null;
    }
}
