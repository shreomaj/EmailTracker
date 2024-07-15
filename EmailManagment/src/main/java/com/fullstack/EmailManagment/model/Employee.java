package com.fullstack.EmailManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {

	@Id
    private String email;
    private String name;
    private String designation;
    private double ctc;
    
	public Employee(String email, String name, String designation, double ctc) {
		super();
		this.email = email;
		this.name = name;
		this.designation = designation;
		this.ctc = ctc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
    
}
