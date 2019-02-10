package fr.zaroumia.formation.spring._010;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main010 {
	public static void main(final String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_010.xml");
		DataBaseProperties baseProperties = applicationContext.getBean(DataBaseProperties.class);
		System.out.println(baseProperties);
	}
}
