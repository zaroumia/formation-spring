package fr.zaroumia.formation.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Service
public class FormationServiceImpl implements FormationService {

	@Autowired
	private FormationDao formationDao;

	@Transactional
	@Override
	public void create(final Formation formation) {
		formationDao.create(formation);
	}
}
