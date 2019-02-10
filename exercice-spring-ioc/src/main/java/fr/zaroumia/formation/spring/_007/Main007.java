package fr.zaroumia.formation.spring._007;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main007 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_007.xml");
		Bean007 bean007 = applicationContext.getBean(Bean007.class);
		System.out.println(bean007);
	}
}
