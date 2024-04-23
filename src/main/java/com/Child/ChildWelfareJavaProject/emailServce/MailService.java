package com.Child.ChildWelfareJavaProject.emailServce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//@Service
//public interface MailService 
//{
//	public void sendEmail(Mail mail);
//}

//@Service
//public class MailService {
//
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    public void sendSimpleEmail(String to, String subject, String text) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
//        javaMailSender.send(message);
//    }

@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmailToMultipleRecipients(String[] recipients, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(recipients); // Add multiple recipients
        message.setSubject(subject);
        message.setText(text);

        javaMailSender.send(message);
    }
	
}