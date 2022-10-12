package com.info;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
	Student obj=context.getBean(Student.class);
	obj.displayInfo();
	context.registerShutdownHook();
	context.close();

}
}
