package fr.zaroumia.formation.spring._033;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main033 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration033.class);
		UserService userservice = applicationContext.getBean(UserService.class);
		userservice.isUsernameExists("zaroumia");
		System.out.println(userservice.getUser("zaroumia"));
	}
}
