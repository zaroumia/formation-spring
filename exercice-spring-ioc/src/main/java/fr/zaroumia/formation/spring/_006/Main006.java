package fr.zaroumia.formation.spring._006;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.zaroumia.formation.spring.dao.FormationDao;

public class Main006 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_006.xml");
		// FormationService formationService =
		// applicationContext.getBean(FormationService.class);
		Map<String, FormationDao> beans = applicationContext.getBeansOfType(FormationDao.class);
		beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));

		System.out.println(applicationContext.getBean("formationDao") == applicationContext.getBean("formationDao2"));
		System.out.println(applicationContext.getBean("formationDao2") == applicationContext.getBean("formationDao3"));
		System.out.println(applicationContext.getBean("formationDao4") == applicationContext.getBean("formationDao3"));

	}
}
