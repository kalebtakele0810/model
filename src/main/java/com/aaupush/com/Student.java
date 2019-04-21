package com.aaupush.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	private int entryyear;
	private int sectionnumber;
	private String registration;
	private int phone;
	@Id
	private int Id;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
