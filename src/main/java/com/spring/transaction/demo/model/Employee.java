package com.spring.transaction.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    
    public Employee() {

    }

    public Employee(String name) {
        this.empName = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int empId;
    String empName;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
