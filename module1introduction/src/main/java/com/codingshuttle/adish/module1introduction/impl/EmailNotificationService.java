package com.codingshuttle.adish.module1introduction.impl;

import com.codingshuttle.adish.module1introduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "email")
@ConditionalOnMissingBean(SmsNotificationService.class)
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
