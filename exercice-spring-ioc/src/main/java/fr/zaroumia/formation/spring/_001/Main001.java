package fr.zaroumia.formation.spring._001;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;
import fr.zaroumia.formation.spring.service.FormationServiceImpl;

public class Main001 {
	public static void main(final String[] args) {
		FormationServiceImpl service = new FormationServiceImpl();
		FormationDao dao = new FormationDaoImpl();
		service.setFormationDao(dao);
		System.out.println(service.findAll());

	}
}
