package com.cr7.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.cr7.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	@NotNull(message="isRequired")
	@Size(min=1,message="isRequired")
	private String lastName;
	@NotNull(message="isRequired")
	@Min(value=0,message="Value must be greater than zero.")
	@Max(value=10,message="Value must be less than ten")
	private Integer freePasses;
	@Pattern(regexp="^[A-za-z0-9]{5}",message="Only 5 character")
	private String postalCode;
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
}
