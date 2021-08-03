package com.example.three.SpringRestPincode;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PinController {
	
	@Autowired
	PinService s;

	@GetMapping("/find/{pincode}")
	public Pincode pincode (@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
