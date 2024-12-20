package org.example.service.channelmpl;

import org.example.service.channel.NotificationChannel;

public class Email implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent");
    }
}
