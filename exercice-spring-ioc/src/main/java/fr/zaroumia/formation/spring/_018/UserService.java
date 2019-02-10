package fr.zaroumia.formation.spring._018;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import fr.zaroumia.formation.spring.dao.FormationDao;

@Component
public class UserService {

	@Autowired
	@Qualifier("formationDao1")
	private FormationDao formationDao;

	public UserService() {
		System.out.println("constructeur par défaut  de UserService");
	}
}
