package com.smartBazar.Dto;

public class CustomerDto {
	private	String name;
	private	Long phone;
	private String email;
	private	String Password;
	private double wallet;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String pwd) {
		this.Password = pwd;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
		

}
