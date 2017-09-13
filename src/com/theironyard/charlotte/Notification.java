package com.theironyard.charlotte;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;

        status = "OKAY";
        createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void showStatus() {
        System.out.println(status);
    }

    public void transport() throws NoTransportException {
    }
}
