package com.codingshuttle.adish.module1introduction;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class PaymentService {

    public void pay() {
        System.out.println("Paying...");
    }
}
