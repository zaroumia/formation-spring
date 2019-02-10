package fr.zaroumia.formation.spring._014;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MonService implements InitializingBean, DisposableBean {

	public MonService() {
		System.out.println("constructeur");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("je suis la méthode  afterPropertiesSet de la classe MonService");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("je suis la méthode  destroy de la classe MonService");

	}

}
