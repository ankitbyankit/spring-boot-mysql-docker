package com.spring.transaction.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.transaction.demo.services.EmployeeService;
import com.spring.transaction.demo.model.Employee;

@RestController
public class EmployeeController {
    
    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value="/retrieve", method=RequestMethod.GET)
    public List<Employee> retrieve() {
        return employeeService.retrieve();
    }

    @RequestMapping(value="/insert", method=RequestMethod.POST)
    public ResponseEntity<?> insert(@RequestBody Employee emp){
        employeeService.insert(emp);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
