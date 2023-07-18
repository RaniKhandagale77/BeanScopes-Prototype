package com.jsp.scope.pen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Pen pen=(Pen)applicationContext.getBean("mypen");
		Pen pen2=(Pen)applicationContext.getBean("mypen");
		pen.setMessage("Hiii...");
		System.out.println(pen.getMessage());
		System.out.println(pen2.getMessage());
	}
}
