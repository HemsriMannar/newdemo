package com.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cust {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
	Customer customer = (Customer) context.getBean("customer");
    System.out.println(customer);
}
}
