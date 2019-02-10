package fr.zaroumia.formation.spring.dao._001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class Main {

	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration001.class);
		FormationDao formationDao = applicationContext.getBean(FormationDao.class);
		System.out.println("Nombre de formations disponibles dans la BD : " + formationDao.getCountFormations());

	}
}
