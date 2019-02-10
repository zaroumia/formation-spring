package fr.zaroumia.formation.spring.dao;

import java.util.Collection;
import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public interface FormationDao {

	void create(Formation formation);

	void update(Formation formation);

	void delete(Formation formation);

	Formation find(Long id);

	List<Formation> findAll();

	int getCountFormations();

	int getCountFormationsParLangue(String langue);

	void extractToCsv();

	Formation findAvecLangues(Long id);

	String findTitreParId(final Long id);

	default void create(final Collection<Formation> formations) {
	}
}
