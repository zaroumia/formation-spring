package fr.zaroumia.formation.spring.dao;

import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public interface FormationDao {

	String quiSuisJe();

	List<Formation> findAll();
}
