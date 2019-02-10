package fr.zaroumia.formation.spring._018;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main018 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration018.class);
		UserService userService = applicationContext.getBean(UserService.class);
	}
}
