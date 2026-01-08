package com.codingshuttle.adish.module1introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService getPaymentService() {
        //more logic
        return new PaymentService();
    }
}
