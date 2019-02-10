package fr.zaroumia.formation.spring._019;

import org.springframework.stereotype.Service;

import fr.zaroumia.formation.spring.dao.FormationDao;

@Service
public class FormationService {

	private final FormationDao formationDao;

	FormationService(final FormationDao dao) {
		super();
		System.out.println("je suis le constructeur de formationService");
		this.formationDao = dao;
	}

	public void afficherToutesLesFormations() {
		formationDao.findAll().forEach(System.out::println);
	}
}
