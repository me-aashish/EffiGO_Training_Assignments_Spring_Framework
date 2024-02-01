package com.aashish.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aashish.spring.learnspringframework.enterprise.example.web.MyWebController;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//		GameRunner runner = context.getBean(GameRunner.class);
		//		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);

		System.out.println(controller.returnValueFromBusinessService());
	}

}
