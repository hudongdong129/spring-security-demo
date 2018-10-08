/**
 * @author huDong
 */
package com.hu.web.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hu.web.filter.TimeFilter;

/**
 * @author Administrator
 *
 */
@Configuration
public class WebConfig {

	@Bean
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
