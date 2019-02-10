package fr.zaroumia.formation.spring.dao;

import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public interface FormationDao {

	void create(Formation formation);

	void update(Formation formation);

	void delete(Formation formation);

	Formation find(Integer id);

	List<Formation> findAll();
}
