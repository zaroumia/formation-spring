package fr.zaroumia.formation.spring._019;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main019 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration019.class);
		FormationService service = applicationContext.getBean(FormationService.class);
		service.afficherToutesLesFormations();
	}
}
