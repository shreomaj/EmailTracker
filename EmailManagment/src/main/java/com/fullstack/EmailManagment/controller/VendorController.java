package com.fullstack.EmailManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.EmailManagment.model.Vendor;
import com.fullstack.EmailManagment.service.EmailService;
import com.fullstack.EmailManagment.service.VendorServiceImpl;
import com.fullstack.EmailManagment.serviceInterface.EmployeeService;
import com.fullstack.EmailManagment.serviceInterface.VendorService;
@RestController
@RequestMapping("/api")
public class VendorController {
//	@Autowired
//    private VendorServiceImpl vendorService;
//
//    @Autowired
//    private EmailService emailService;
//
//    @PostMapping
//    public Vendor createVendor(@RequestBody Vendor vendor) {
//        return vendorService.saveVendor(vendor);
//    }
//
//    @GetMapping
//    public List<Vendor> getAllVendors() {
//        return vendorService.getAllVendors();
//    }
//
//    @PostMapping("/sendEmails")
//    public void sendEmails(@RequestBody List<String> vendorEmails) {
//        emailService.sendEmails(vendorEmails);
//    }

//    @GetMapping("/sentEmails")
//    public List<String> getSentEmails() {
//        return emailService.getSentEmails();
//    }
	@Autowired
    private EmployeeService employeeService;

    @Autowired
    private VendorService vendorService;
	 @PostMapping("/vendors")
	    public void addVendor(@RequestBody Vendor vendor) {
	        vendorService.addVendor(vendor);
	    }

	    @GetMapping("/vendors")
	    public List<Vendor> getVendors() {
	        return vendorService.getVendors();
	    }
	  @PostMapping("/vendors/sendEmails")
	    public void sendEmails(@RequestBody List<String> vendorEmails) {
	        vendorService.sendEmails(vendorEmails);
	    }

	    @GetMapping("/vendors/sentEmails")
	    public List<String> getSentEmails() {
	        return vendorService.getSentEmails();
	    }

}
