package fr.zaroumia.formation.spring._002;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MonBean implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public void helloWorld() {
		System.out.println("Hello World from " + applicationContext.getDisplayName());
	}

	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}
}
