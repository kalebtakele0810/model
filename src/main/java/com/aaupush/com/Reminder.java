package com.aaupush.com;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Reminder {
private String title;
private Date due_date;
private String place;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getDue_date() {
	return due_date;
}
public void setDuedate(Date due_date) {
	this.due_date = due_date;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

}
