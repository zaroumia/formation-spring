package fr.zaroumia.formation.spring._017;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import fr.zaroumia.formation.spring.dao.FormationDao;

@Service
public class FormationService {

	@Resource(name = "formationDao2")
	private FormationDao dao;

	public void afficherToutesLesFormation() {
		dao.findAll().forEach(System.out::println);
	}
}
