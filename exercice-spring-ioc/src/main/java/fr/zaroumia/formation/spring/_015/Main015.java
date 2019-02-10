package fr.zaroumia.formation.spring._015;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main015 {
	public static void main(final String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_015.xml");
		applicationContext.getEnvironment().setActiveProfiles("dev");
		applicationContext.refresh();
	}
}
