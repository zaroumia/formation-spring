package fr.zaroumia.formation.spring._033;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Repository
@Primary
public class FormationDaoAImpl implements FormationDao {

	@Override
	public String quiSuisJe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
