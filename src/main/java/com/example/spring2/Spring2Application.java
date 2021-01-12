package com.example.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Spring2Application {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to java dunyasina";
	}
	@GetMapping("/input")
	public String congrats(@PathVariable String input) {
		return "hi" + input + "Your application deployed successfully...";
	}
	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

}
