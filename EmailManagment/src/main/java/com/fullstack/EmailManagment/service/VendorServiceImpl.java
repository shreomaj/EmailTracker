package com.fullstack.EmailManagment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.EmailManagment.model.Vendor;
import com.fullstack.EmailManagment.repository.VendorRepository;
import com.fullstack.EmailManagment.serviceInterface.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	
//	 @Autowired
//	    private VendorRepository vendorRepository;
//
//	    public Vendor saveVendor(Vendor vendor) {
//	        return vendorRepository.save(vendor);
//	    }
//
//	    public List<Vendor> getAllVendors() {
//	        return vendorRepository.findAll();
//	    }
	private List<Vendor> vendors = new ArrayList<>();
    private List<String> sentEmails = new ArrayList<>();

    @Override
    public void addVendor(Vendor vendor) {
        vendors.add(vendor);
    }

    @Override
    public List<Vendor> getVendors() {
        return vendors;
    }

    @Override
    public void sendEmails(List<String> vendorEmails) {
        for (String email : vendorEmails) {
            Optional<Vendor> vendor = vendors.stream().filter(v -> v.getEmail().equals(email)).findFirst();
            vendor.ifPresent(v -> sentEmails.add("Sending payments to vendor " + v.getName() + " at upi " + v.getUpi()));
        }
    }

    @Override
    public List<String> getSentEmails() {
        return sentEmails;
    }
}

