package fr.zaroumia.formation.spring._004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.zaroumia.formation.spring.service.FormationService;

public class Main004 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_004.xml");
		FormationService formationService = applicationContext.getBean(FormationService.class);
	}
}
