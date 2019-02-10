package fr.zaroumia.formation.spring._036;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main036 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_036.xml");
		UserService userservice = applicationContext.getBean(UserService.class);
		userservice.isUsernameExists("zarouamia");
	}
}
