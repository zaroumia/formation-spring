package fr.zaroumia.formation.spring._020;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main020 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration020.class);
		DatabaseProperties databaseProperties = applicationContext.getBean(DatabaseProperties.class);
		System.out.println(databaseProperties);
	}
}
