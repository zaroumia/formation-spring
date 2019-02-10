package fr.zaroumia.formation.spring._022;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Ecole implements InitializingBean, DisposableBean {

	public Ecole() {
		System.out.println("constructeur par defaut de la classe Ecole");
	}

	// @PostConstruct
	// private void init() {
	// System.out.println("la méthode init est appelée");
	// }
	//
	// @PreDestroy
	// private void destroy() {
	// System.out.println("la méthode destroy est appelée");
	// }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("la méthode inafterPropertiesSetit est appelée");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("la méthode destroy est appelée");

	}

}
