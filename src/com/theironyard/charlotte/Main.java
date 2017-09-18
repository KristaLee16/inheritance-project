package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        EmailNotification em = new EmailNotification("uhoh", "you broke the thing",
                "mike", "some smtp server ip address");

        TextNotification tm = new TextNotification("Uhoh", "you broke the thing",
                "ben", "idk maybe verizon");

        tm.showStatus();
        em.showStatus();



        System.out.println(em.getRecipient());
        System.out.println(tm.getRecipient());
    }
}


