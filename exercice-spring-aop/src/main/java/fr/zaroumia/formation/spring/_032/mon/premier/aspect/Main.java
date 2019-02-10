package fr.zaroumia.formation.spring._032.mon.premier.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(final String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationMonPremierASpect.class);
		UserService service = context.getBean(UserService.class);
		service.getUser("zaroumia");
	}
}
