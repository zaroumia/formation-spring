package fr.zaroumia.formation.spring._009;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.zaroumia.formation.spring.service.FormationService;

public class Main009 {
	public static void main(final String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_009all.xml");
		FormationService formationService = applicationContext.getBean(FormationService.class);
	}
}
