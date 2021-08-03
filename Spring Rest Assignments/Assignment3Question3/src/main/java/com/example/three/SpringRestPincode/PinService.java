package com.example.three.SpringRestPincode;

import org.springframework.stereotype.Service;

@Service
public interface PinService {

	public Pincode getDetails(int pincode);

}
