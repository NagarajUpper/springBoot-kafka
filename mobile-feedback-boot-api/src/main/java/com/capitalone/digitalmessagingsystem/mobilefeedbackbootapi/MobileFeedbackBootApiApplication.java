package com.capitalone.digitalmessagingsystem.mobilefeedbackbootapi;

import org.apache.catalina.startup.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.capitalone.digitalmessagingsystem.mobilefeedbackboot.sender.Sender;

@SpringBootApplication
@Import({Bootstrap.class})
public class MobileFeedbackBootApiApplication  implements CommandLineRunner {
	
	@Autowired
	public Sender sender;
	
	public static void main(String[] args) {
	    SpringApplication.run(MobileFeedbackBootApiApplication.class, args);
	  }

	@Override
	public void run(String... arg0) throws Exception {
		
		sender.send("Rose-1", "Hello world4");
		
	}

}
