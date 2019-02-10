package fr.zaroumia.formation.spring._014;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main014 {
	public static void main(final String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:appContext_014.xml");
		applicationContext.close();
	}
}
