/**
 * 
 */
package com.hu.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.hu.service.HelloService;

/**
 * @author Administrator
 *
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {

	@Autowired
	private HelloService helloService;
	
	
	@Override
	public void initialize(MyConstraint constraintAnnotation) {
		System.out.println("my validator init");
		
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		String name = (String)value;
		if ("toms".equals(name)) {
			return true;
		}
		helloService.greeting("tom");
		System.out.println(value);
		return false;
	}

}
