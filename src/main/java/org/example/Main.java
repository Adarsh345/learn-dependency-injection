package org.example;

import org.example.service.NotificationService;
import org.example.service.channelmpl.SMS;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService(new SMS());

        notificationService.sendNotification("message");
        

    }
}