package com.codingshuttle.adish.module1introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@Component
/*@Repository
@Service
@Controller
@RestController*/
public class PaymentService {

    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterIntialization() {
        System.out.println("After intialization...");
    }

    @PreDestroy
    public  void beforeFinalization() {
        System.out.println("Before finalization...");
    }
}
