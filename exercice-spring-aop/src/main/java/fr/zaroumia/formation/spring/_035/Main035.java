package fr.zaroumia.formation.spring._035;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main035 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration035.class);
		UserService userservice = applicationContext.getBean(UserService.class);
		userservice.isUsernameExists("zarouamia");
	}
}
