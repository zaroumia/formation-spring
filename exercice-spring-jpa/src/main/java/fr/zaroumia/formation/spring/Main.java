package fr.zaroumia.formation.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.modele.Formation;
import fr.zaroumia.formation.spring.service.FormationService;

public class Main {
	public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(final String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoConfiguration.class,
				AppConfiguration.class);
		FormationService bean = context.getBean(FormationService.class);

		LOGGER.info("*********** Création d'une nouvelle formation");
		Formation formation = new Formation("nouvelle formation", "un descriptif");
		bean.create(formation);
	}
}
