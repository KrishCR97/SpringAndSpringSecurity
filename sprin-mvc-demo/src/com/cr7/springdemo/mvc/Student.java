package com.cr7.springdemo.mvc;

import java.util.LinkedHashMap;

import com.sun.istack.internal.NotNull;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private String[] operatingSystems;
	public Student() {
		countryOptions = new LinkedHashMap<>();
		this.countryOptions.put("BRA", "Brazil");
		this.countryOptions.put("FRA", "France");
		this.countryOptions.put("IND", "India");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
