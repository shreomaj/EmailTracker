package com.fullstack.EmailManagment.serviceInterface;

import java.util.List;

import com.fullstack.EmailManagment.model.Employee;

public interface EmployeeService {
	
	 void addEmployee(Employee employee);
	    List<Employee> getEmployees();

}
