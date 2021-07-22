package com.spring.assignment1.question1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructorBeans.xml");
		Customer customer = (Customer)applicationContext.getBean("obj");
		customer.displayInfo();

	}

}
