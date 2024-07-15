package com.fullstack.EmailManagment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.EmailManagment.model.Vendor;
import com.fullstack.EmailManagment.repository.VendorRepository;

@Service
public class EmailService {
	private final List<String> sentEmails = new ArrayList<>();
	 @Autowired
	    private VendorRepository vendorRepository;

	    public void sendEmails(List<String> vendorEmails) {
	        for (String email : vendorEmails) {
	            Vendor vendor = vendorRepository.findById(email).orElse(null);
	            if (vendor != null) {
	                String message = "Sending payments to vendor " + 
	            vendor.getName() + " at upi " + vendor.getUpi();
	                sentEmails.add(message);
	                System.out.println(message);
	            }
	        }
	    }

	    public List<String> getSentEmails() {
	        return new ArrayList<>(sentEmails);
	    }

}
