package fr.zaroumia.formation.spring._033;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;
import fr.zaroumia.formation.spring.service.FormationService;

@Service
public class FormationServiceImpl implements FormationService {

	@Autowired
	private FormationDao dao;

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
