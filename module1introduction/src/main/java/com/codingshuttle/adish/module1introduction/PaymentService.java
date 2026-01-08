package com.codingshuttle.adish.module1introduction;

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
}
