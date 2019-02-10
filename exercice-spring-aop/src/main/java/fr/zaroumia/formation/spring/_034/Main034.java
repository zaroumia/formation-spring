package fr.zaroumia.formation.spring._034;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main034 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration034.class);
		UserService userservice = applicationContext.getBean(UserService.class);
		userservice.isUsernameExists("zaroumia");
		// userservice.getUser("zzaroumia");

	}
}
