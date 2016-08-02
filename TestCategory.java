package com.niit.ShoppingCart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {

	public static void main(String[]args){
	
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	context.getBean("Category");
	
	System.out.println("bean created successfully");
	}
	
	
}
