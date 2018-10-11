/**
 * @author huDong
 */
package com.hu.web.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hu.web.filter.TimeFilter;
import com.hu.web.interceptor.TimeInterceptor;

/**
 * @author Administrator
 *
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	

//	@Autowired
//	private TimeInterceptor timeInterceptor;
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(timeInterceptor);
//	}
//	


//	@Bean
	public FilterRegistrationBean timeFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		
		TimeFilter timeFilter = new TimeFilter();
		registrationBean.setFilter(timeFilter);
		
		List<String> urList = new ArrayList<>();
		urList.add("/*");
		registrationBean.setUrlPatterns(urList);
		return registrationBean;
	}
}
