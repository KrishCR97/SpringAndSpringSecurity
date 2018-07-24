package com.cr7.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		coursePrefix = constraintAnnotation.value();	
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean result = arg0.startsWith(coursePrefix);
		return result;
	}

}
