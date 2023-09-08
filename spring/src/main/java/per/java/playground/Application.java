package per.java.playground;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.java.playground.beans.User;

@ComponentScan(basePackages = {"per.java.playground.conf"})
public class Application {
	public static void main(String[] args) {
		//Spring Ioc Container Config test;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
	}
}
