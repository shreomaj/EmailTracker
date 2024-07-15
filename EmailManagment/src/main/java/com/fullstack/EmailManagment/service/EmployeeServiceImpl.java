package com.fullstack.EmailManagment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.EmailManagment.model.Employee;
import com.fullstack.EmailManagment.repository.EmployeeRepository;
import com.fullstack.EmailManagment.serviceInterface.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
//	    @Autowired
//	    private EmployeeRepository employeeRepository;
//
//	    public Employee saveEmployee(Employee employee) {
//	        return employeeRepository.save(employee);
//	    }
//
//	    public List<Employee> getAllEmployees() {
//	        return employeeRepository.findAll();
//	    }
	private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

}
