package com.hu.core;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import com.hu.security.core.validate.code.ValidateCode;
import com.hu.security.core.validate.code.ValidateCodeGenerator;

//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	@Override
	public ValidateCode createImageCode(ServletWebRequest request) {
		System.out.println("更高级的图形验证码代码");
		return null;
	}

}
