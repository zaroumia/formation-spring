package fr.zaroumia.formation.spring.dao;

import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public interface FormationDao {

	void create(Formation formation);

	void createLangue(Formation formation, String langue);

	void update(Formation formation);

	void delete(Formation formation);

	Formation find(Long id);

	List<Formation> findAll();

	String findTitreParId(final Long id);

}
