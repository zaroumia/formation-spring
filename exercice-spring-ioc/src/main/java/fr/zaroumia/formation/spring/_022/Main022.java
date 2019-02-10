package fr.zaroumia.formation.spring._022;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main022 {
	public static void main(final String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Configuration022.class);

		applicationContext.close();
	}
}
