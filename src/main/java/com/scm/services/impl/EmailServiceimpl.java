package com.scm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import com.scm.services.EmailService;

@Service
public class EmailServiceimpl implements EmailService {

    @Autowired
    private JavaMailSender eMailSender;

    @Value("${spring.mail.properties.domain_name}")
    private String domainname;
    // send email
    public void sendEmail(String to, String subject, String body) {
        // send email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        message.setFrom(domainname);
        eMailSender.send(message);
    }

    public void sendEmailWithhtml() {
        // send email with html
    }

    public void sendEmailWithAttachment() {
        // send email with attachment
    }
}
