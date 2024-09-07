package com.albincode.springboot.employeemvc.service;

import com.albincode.springboot.employeemvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
