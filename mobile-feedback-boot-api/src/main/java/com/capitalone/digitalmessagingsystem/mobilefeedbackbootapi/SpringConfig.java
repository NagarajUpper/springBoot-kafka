package com.capitalone.digitalmessagingsystem.mobilefeedbackbootapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capitalone.digitalmessagingsystem.mobilefeedbackboot.api.FeedBackApi;
import com.capitalone.digitalmessagingsystem.mobilefeedbackboot.sender.serviceImpl.MobileImpl;

@Configuration
public class SpringConfig {
	
	  @Bean
	  public FeedBackApi feedBackApi() {
		  return new MobileImpl();
	  }

}
