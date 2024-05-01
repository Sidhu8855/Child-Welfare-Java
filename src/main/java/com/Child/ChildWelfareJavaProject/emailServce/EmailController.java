package com.Child.ChildWelfareJavaProject.emailServce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
//	@RequestMapping("/email")
//	public class EmailController {
//
//	    @Autowired
//	    private MailService mailService;
//
//	    @PostMapping("/send")
//	    public ResponseEntity<String> sendEmail(@RequestParam String recipient, 
//	                                            @RequestParam String subject, 
//	                                            @RequestParam String content) {
//	        try {
//	            mailService.sendSimpleEmail(recipient, subject, content);
//	            return ResponseEntity.ok("Email sent successfully to " + recipient);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            return ResponseEntity.status(500).body("Failed to send email: " + e.getMessage());
//	        }
//	    }
//	}


@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendMultiple")
    public ResponseEntity<String> sendEmailToMultipleRecipients(@RequestBody EmailRequest emailRequest) {
        try {
            mailService.sendEmailToMultipleRecipients(
                emailRequest.getRecipients().toArray(new String[0]), 
                emailRequest.getSubject(), 
                emailRequest.getContent()
            );
            return ResponseEntity.ok("Emails sent successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to send emails: " + e.getMessage());
        }
    }
}
