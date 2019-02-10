package fr.zaroumia.formation.spring._003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.zaroumia.formation.spring.service.FormationService;

public class Main003 {
	public static void main(final String[] args) {
		// Créer une instance de ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_003.xml");

		// Récupérer le bean FormationService
		FormationService service = applicationContext.getBean(FormationService.class);

		// Appeler la méthode
		System.out.println(service.findAll());
	}
}
