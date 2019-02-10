package fr.zaroumia.formation.spring.service;

import java.util.List;

import fr.zaroumia.formation.spring.modele.Formation;

public interface FormationService {

	List<Formation> findAll();
}
