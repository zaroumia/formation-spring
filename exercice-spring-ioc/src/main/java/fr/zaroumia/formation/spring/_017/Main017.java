package fr.zaroumia.formation.spring._017;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main017 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration017.class);
		FormationService service = applicationContext.getBean(FormationService.class);
		service.afficherToutesLesFormation();
	}
}
