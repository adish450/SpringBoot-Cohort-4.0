package com.codingshuttle.adish.module1introduction.impl;

import com.codingshuttle.adish.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
