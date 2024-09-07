package com.albincode.springboot.employeemvc.dao;

import com.albincode.springboot.employeemvc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need to write any code :)

}
