package fr.zaroumia.formation.spring.dao._004;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

public class Main {
	public static void main(final String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configuration004.class);
		FormationDao bean = context.getBean(FormationDao.class);

		// System.out.println(
		// "Nombre de formations disponibles en Anglais : " +
		// bean.getCountFormationsParLangue("Anglais"));

		// System.out.println("Le titre de la formation avec l'id " + 5 + " est
		// : " + bean.findTitreParId(5L));

		// Formation formation = new Formation(1L, "nouveau titre",
		// "descriptif");
		// bean.update(formation);

		List<Formation> formations = new ArrayList<>();
		for (long i = 100; i < 1000; i++) {
			Formation formation = new Formation(i, "nouveau titre", "descriptif");
			formations.add(formation);
		}

		System.out.println("debut du traitement batch");
		bean.create(formations);
		System.out.println("fin du traitement batch");
		context.close();
	}
}
