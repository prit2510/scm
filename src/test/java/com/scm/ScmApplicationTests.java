package com.scm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scm.services.EmailService;

import jakarta.validation.constraints.Email;

@SpringBootTest
class ScmApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private EmailService emailService;

	@Test
	void sendEmailTest () {
		// send email
		emailService.sendEmail(
			"pritnpatel2510@gmail.com", 
			"Test Email", 
			"This is a test email");	
	}

}
