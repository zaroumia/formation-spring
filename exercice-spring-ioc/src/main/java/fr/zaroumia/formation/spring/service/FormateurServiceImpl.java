package fr.zaroumia.formation.spring.service;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class FormateurServiceImpl implements FormateurService {

	private FormationDao formationDao;

	public FormateurServiceImpl() {
		System.out.println("FormateurServiceImpl : constructeur par défaut");
	}

	public FormateurServiceImpl(final FormationDao formationDao) {
		super();
		this.formationDao = formationDao;
		System.out.println("FormateurServiceImpl : constructeur avec arguements");
	}

	public void setFormationDao(final FormationDao formationDao) {
		this.formationDao = formationDao;
		System.out.println("FormateurServiceImpl :le setter de formationDao");
	}

}
