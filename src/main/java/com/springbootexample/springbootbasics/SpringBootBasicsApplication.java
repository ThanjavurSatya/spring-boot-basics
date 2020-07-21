package com.springbootexample.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SpringBootBasicsApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootBasicsApplication.class, args);
		SortManager sortManager = applicationContext.getBean(SortManager.class);
		SortManager sortManager1 = applicationContext.getBean(SortManager.class);
		System.out.println(sortManager);
		System.out.println(sortManager1);
		int sortedElement = sortManager.getSortedElement(new int[]{1,2,3,4,5},3);
		System.out.println("SortedElement is : " + sortedElement);
	}
}
