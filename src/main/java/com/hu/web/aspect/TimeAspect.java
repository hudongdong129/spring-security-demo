/**
 * @author huDong
 */
package com.hu.web.aspect;


import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
//@Aspect
//@Component
public class TimeAspect {

	@Before("execution(public * com.hu.web.controller.UserController.*(..))")
	public Object handlerControllerMethod() throws Throwable {
		System.out.println("time aspect start");
		
//		Object[] objects = pjp.getArgs();
//		for(Object object : objects) {
//			System.out.println("arg is "+object);
//		}
//		long start = new Date().getTime();
//		
//		Object object = pjp.proceed();
//		
//		System.out.println("time aspect 耗时:"+ (new Date().getTime() - start));
//		System.out.println("time aspect end");
		
		return new Object();
	}
}
