package fr.zaroumia.formation.spring;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.model.Formateur;
import fr.zaroumia.formation.spring.service.FormateurService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(final String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FormateurService service = applicationContext.getBean(FormateurService.class);
		// TODO Créer un formateur
		Formateur f = new Formateur();
		f.setAge(31);
		f.setId(1L);
		f.setNom("ZAROUMIA");
		f.setPrenom("Alex");
		service.create(f);
		System.out.println(f);
		// TODO Modifier un formateur
		f.setPrenom("ALEX");
		// TODO Récupérer le formateur par son ID
		Formateur formateur = service.find(f.getId());
		System.out.println(formateur);
		// TODO Supprimer le formateur
		service.delete(f);
		// TODO Récupérer tous les formateurs
		Collection<Formateur> collection = service.findAll();
		System.out.println("nombre de formateurs dans la collection : " + collection.size());

	}
}
