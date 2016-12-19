package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = SpringApplication.run(HelloWorldTest.class, args);
		HelloWorldService hwService = (HelloWorldService) ctx.getBean("helloWorldService");
		hwService.sayHello();

	}

}
