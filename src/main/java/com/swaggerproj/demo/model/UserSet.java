package com.swaggerproj.demo.model;

import org.springframework.stereotype.Component;

@Component
public class UserSet {

	private int id;
	private String name;
	private String mobile;
	private String address;
	private String emailAddress;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress; }
    public String getEmailAddress(){return emailAddress;}
}