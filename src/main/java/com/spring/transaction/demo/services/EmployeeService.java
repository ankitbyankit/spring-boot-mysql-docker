package com.spring.transaction.demo.services;

import java.util.List;

import com.spring.transaction.demo.model.Employee;

public interface EmployeeService {
    public List<Employee> retrieve();
    public String insert(Employee employee);
}
