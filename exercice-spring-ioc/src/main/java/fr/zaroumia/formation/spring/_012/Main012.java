package fr.zaroumia.formation.spring._012;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class Main012 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_012.xml");
		FormationDao formationDao1 = applicationContext.getBean(FormationDao.class);
		FormationDao formationDao2 = applicationContext.getBean(FormationDao.class);

		System.out.println("est-ce que les deux beans sont les mêmes ?" + (formationDao1 == formationDao2));
	}
}
