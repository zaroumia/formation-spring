package fr.zaroumia.formation.spring._016;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main016 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration016.class);
	}
}
