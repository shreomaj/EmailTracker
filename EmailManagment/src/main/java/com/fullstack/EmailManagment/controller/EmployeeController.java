package com.fullstack.EmailManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.EmailManagment.model.Employee;
import com.fullstack.EmailManagment.service.EmployeeServiceImpl;
import com.fullstack.EmailManagment.serviceInterface.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
//	@Autowired
//    private EmployeeServiceImpl employeeService;
//	
//	
//
//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }
//
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}
