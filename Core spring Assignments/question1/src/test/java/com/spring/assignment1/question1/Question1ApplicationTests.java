package com.spring.assignment1.question1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Question1ApplicationTests {

	@Test
	void mytest() {
		Customer obj1 = new Customer(002,
				"Ravi",
				934545,
				new Address("white house street","Puducherry","Puducherry",605013,"India"));
		assertEquals(obj1.getCustomerId(),002,"Customer ID");
		assertEquals(obj1.getCustomerName(),"Ravi","Customer Name");
		assertEquals(obj1.getCustomerContact(),934545,"Customer CONTACT");
		assertEquals(obj1.getCustomerAddress().getStreet(),"white house street","Street");
		assertEquals(obj1.getCustomerAddress().getCity(),"Puducherry","City");
		assertEquals(obj1.getCustomerAddress().getState(),"Puducherry","State");
		assertEquals(obj1.getCustomerAddress().getZip(),605013,"zip");
		assertEquals(obj1.getCustomerAddress().getCountry(),"India","Country");


	}

}
