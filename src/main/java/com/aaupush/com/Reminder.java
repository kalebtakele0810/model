package com.aaupush.com;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Reminder {
private String title;
private Date duedate;
private String place;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getDuedate() {
	return duedate;
}
public void setDuedate(Date duedate) {
	this.duedate = duedate;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

}
