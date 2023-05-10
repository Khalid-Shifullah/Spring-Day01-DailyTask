package com.example.AOPTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopTestApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AopTestApplication.class, args);
		ClassA classA = context.getBean(ClassA.class);

		classA.printHello();
		System.out.println();

		System.out.println(classA.getNum());
		System.out.println(classA.getSum(4, 9));
	}
}


