package org.example.service;

import org.example.service.channel.NotificationChannel;

public class NotificationService {

    private NotificationChannel notificationChannel ;

    public NotificationService(NotificationChannel notificationChannel ){
        this.notificationChannel = notificationChannel;
    }

    public void  sendNotification(String message){
        notificationChannel.sendNotification(message);
    }

}
