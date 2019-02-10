package fr.zaroumia.formation.spring.dao;

import java.util.ArrayList;
import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public class FormationDaoImpl implements FormationDao {

	public FormationDaoImpl() {
		System.out.println("FormationDaoImpl : constructeur par défaut ");

	}

	@Override
	public String quiSuisJe() {
		return " je suis une implémentation de FormationDao ";
	}

	@Override
	public List<Formation> findAll() {
		// on va exécuter une requête pour récupérer la liste des formations en
		// BD
		Formation formation1 = new Formation(1L, "Spring : Etape par étape pour devenir professionnel",
				"un descriptif");
		Formation formation2 = new Formation(2L, "Hibernate : Etape par étape pour devenir professionnel",
				"un descriptif");
		Formation formation3 = new Formation(3L, "JPA : Etape par étape pour devenir professionnel", "un descriptif");
		List<Formation> formations = new ArrayList<>();
		formations.add(formation1);
		formations.add(formation2);
		formations.add(formation3);
		return formations;
	}

}
