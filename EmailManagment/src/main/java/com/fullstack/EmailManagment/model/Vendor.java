package com.fullstack.EmailManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Vendor {
	 @Id
	    private String email;
	    private String name;
	    private String upi;
		public Vendor(String email, String name, String upi) {
			super();
			this.email = email;
			this.name = name;
			this.upi = upi;
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
		public String getUpi() {
			return upi;
		}
		public void setUpi(String upi) {
			this.upi = upi;
		}
		public Vendor() {
			super();
			// TODO Auto-generated constructor stub
		}

		

}
