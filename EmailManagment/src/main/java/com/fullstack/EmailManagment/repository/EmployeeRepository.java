package com.fullstack.EmailManagment.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import  com.fullstack.EmailManagment.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,String> {

}
