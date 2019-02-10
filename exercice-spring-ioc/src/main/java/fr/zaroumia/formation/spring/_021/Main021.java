package fr.zaroumia.formation.spring._021;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class Main021 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration021.class);
		FormationDao bean1 = applicationContext.getBean(FormationDao.class);
		FormationDao bean2 = applicationContext.getBean(FormationDao.class);
		System.out.println("est-ce que les deux beans sont les mêmes : " + (bean1 == bean2));
	}
}
