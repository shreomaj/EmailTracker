package com.fullstack.EmailManagment.serviceInterface;

import java.util.List;

import com.fullstack.EmailManagment.model.Vendor;

public interface VendorService {
 
	void addVendor(Vendor vendor);
    List<Vendor> getVendors();
    void sendEmails(List<String> vendorEmails);
    List<String> getSentEmails();
}
