package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestAppApplication {

	@PostMapping("/purchase/{username}/{amount}/{productName}")
	public String purchase(@RequestBody Order order) {
				return "Hi "+order.getUsername()+" order for "+order.getProductName()+" with amount "+order.getAmount()+" stored succesfully...";

	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}

}
