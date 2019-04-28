package com.aaupush.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
private int id;
private String name;
private String coursecode;
private float ects;
private float credithour;
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
public String getCoursecode() {
	return coursecode;
}
public void setCoursecode(String coursecode) {
	this.coursecode = coursecode;
}
public float getEcts() {
	return ects;
}
public void setEcts(float ects) {
	this.ects = ects;
}
public float getCredithour() {
	return credithour;
}
public void setCredithour(float credithour) {
	this.credithour = credithour;
}

}
