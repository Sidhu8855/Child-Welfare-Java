package com.Child.ChildWelfareJavaProject.emailServce;

import java.util.List;

public class EmailRequest {
    private List<String> recipients;
    private String subject;
    private String content;

    // Getters and Setters

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}