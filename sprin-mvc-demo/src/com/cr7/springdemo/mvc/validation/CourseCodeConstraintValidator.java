package com.cr7.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		this.coursePrefix = theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result = theCode.startsWith(this.coursePrefix);
		return result;
	}

}
