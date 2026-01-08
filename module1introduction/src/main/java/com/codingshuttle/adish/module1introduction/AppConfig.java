package com.codingshuttle.adish.module1introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    PaymentService getPaymentService() {
        //more logic
        return new PaymentService();
    }
}
