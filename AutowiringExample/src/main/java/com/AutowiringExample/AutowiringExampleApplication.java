package com.AutowiringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@Configuration
//@ComponentScan("com.AutowiringExample")
@SpringBootApplication
public class AutowiringExampleApplication {
	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(AutowiringExampleApplication.class, args);

		context.getBean(GameRunner.class).run();
//		AnnotationConfigApplicationContext context2 =
//				new AnnotationConfigApplicationContext(AutowiringExampleApplication.class);
	}
}