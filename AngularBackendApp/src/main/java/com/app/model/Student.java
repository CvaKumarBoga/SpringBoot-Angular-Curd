package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String course;
	private String email;
	private String mobile;
	public Student() {
		super();
	}
	public Student(Integer id, String name, String course, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.mobile = mobile;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
}
