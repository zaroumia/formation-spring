package fr.zaroumia.formation.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.model.Formateur;
import fr.zaroumia.formation.spring.service.FormateurService;

/**
 * Hello world!
 *
 */
public class App {

	static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(final String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FormateurService service = applicationContext.getBean(FormateurService.class);

		// TODO Ajouter 2 formateurs à la collection avec un formateur sans ID
		List<Formateur> formateursAvecUnFormateurSansID = new ArrayList<>();
		formateursAvecUnFormateurSansID.add(new Formateur("Dupont", "Dupont", 1L, 32));
		formateursAvecUnFormateurSansID.add(new Formateur("Durant", "Durant", null, 33));
		create(service, formateursAvecUnFormateurSansID);

		// TODO Ajouter 2 formateurs OK à la collection
		List<Formateur> formateurs = new ArrayList<>();
		formateurs.add(new Formateur("Conan", "Conan", 1L, 32));
		formateurs.add(new Formateur("Dinous", "Dinous", 2L, 33));
		create(service, formateurs);
	}

	private static void create(final FormateurService service, final List<Formateur> formateurs) {

		try {
			service.create(formateurs);
		} catch (Exception e) {
			LOGGER.error("Une erreur lors de l'insertion des formateurs", e);
		} finally {
			Collection<Formateur> collection = service.findAll();
			System.out.println("nombre de formateurs dans la collection : " + collection.size());
		}
	}

}
