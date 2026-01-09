package com.codingshuttle.adish.module1introduction.impl;

import com.codingshuttle.adish.module1introduction.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
