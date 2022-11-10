package com.spring.transaction.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.transaction.demo.DAO.EmployeeRepository;
import com.spring.transaction.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    EmployeeRepository emplRepo;

    @Override
    public List<Employee> retrieve() {
        List<Employee> result = emplRepo.findAll();
        return result;
    }

    @Override
    public String insert(Employee employee) {
        Employee emp = emplRepo.save(employee);
        return emp.getEmpName();
    }
}
