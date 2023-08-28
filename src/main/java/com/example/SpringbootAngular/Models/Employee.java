package com.example.SpringbootAngular.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String firstname;
private String lastName;
private String emailId;
public long getId() {
	return id;	
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Employee() {
	super();
}
public Employee(String firstname, String lastName, String emailId) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.emailId = emailId;
}


}
