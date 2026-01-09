package com.codingshuttle.adish.module1introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {

	@Autowired
	Map<String, NotificationService> notificationServices = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (NotificationService notificationService : notificationServices.values()) {
			notificationService.send("Hello World!");
		}
	}
}
