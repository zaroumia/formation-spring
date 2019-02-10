package fr.zaroumia.formation.spring._008;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main008 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_008.xml");
		MaClasseSingleton singleton = applicationContext.getBean(MaClasseSingleton.class);
		singleton.quiSuisJe();

		BeanACreer beanACreer = applicationContext.getBean(BeanACreer.class);
		beanACreer.quiSuisJe();

	}
}
