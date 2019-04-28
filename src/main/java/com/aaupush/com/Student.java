package com.aaupush.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private int entryyear;
	private int sectionnumber;
	private String registration;
	private int phone;
	@Id
	private int id;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEntryyear() {
		return entryyear;
	}

	public void setEntryyear(int entryyear) {
		this.entryyear = entryyear;
	}

	public int getSectionnumber() {
		return sectionnumber;
	}

	public void setSectionnumber(int sectionnumber) {
		this.sectionnumber = sectionnumber;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
