package fr.zaroumia.formation.spring.dao._002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class Main {
	public static void main(final String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration002.class);
		FormationDao bean = context.getBean(FormationDao.class);
		bean.findAll().forEach(System.out::println);

		// Formation formation = bean.findAvecLangues(1L);
		// System.out.println("La formation : '" + formation.getTitre() + "' est
		// disponbile dans les langues suivante :");
		// formation.getLangues().forEach(System.out::println);

		// bean.extractToCsv();
	}
}
