package fr.zaroumia.formation.spring.dao._003;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

public class Main {
	public static void main(final String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configuration003.class);
		FormationDao bean = context.getBean(FormationDao.class);

		Formation formation = new Formation(4l, "nouvelle formation", "un descriptif");

		// bean.create(formation);

		// formation.setTitre("formation modifiée");
		// bean.update(formation);
		bean.delete(formation);

		context.close();

	}
}
