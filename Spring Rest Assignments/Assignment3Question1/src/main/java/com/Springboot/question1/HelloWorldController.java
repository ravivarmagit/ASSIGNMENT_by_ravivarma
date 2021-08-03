package com.Springboot.question1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloService helloservice;
	
	@GetMapping("/hello")
	public String heyHello() {
		return helloservice.print();
	}
	
	

}
