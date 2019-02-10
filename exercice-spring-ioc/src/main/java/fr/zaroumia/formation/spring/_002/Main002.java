package fr.zaroumia.formation.spring._002;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main002 {
	public static void main(final String[] args) {
		// Créer une instance de ApplicationContext
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_002.xml");
		applicationContext.setDisplayName("Context d'aplication");
		// Récupérer un bean de type MonBean
		MonBean bean = applicationContext.getBean(MonBean.class);

		// Appeler la méthode
		bean.helloWorld();

	}
}
