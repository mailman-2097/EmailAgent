package com.test.email.EmailAgent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class EmailAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailAgentApplication.class, args);
	}

}
