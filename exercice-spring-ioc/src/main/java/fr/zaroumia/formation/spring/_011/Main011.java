package fr.zaroumia.formation.spring._011;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main011 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_011.xml");
	}
}
