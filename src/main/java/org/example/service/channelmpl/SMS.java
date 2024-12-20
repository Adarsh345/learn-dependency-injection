package org.example.service.channelmpl;

import org.example.service.channel.NotificationChannel;

public class SMS implements NotificationChannel {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent.");
    }
}
