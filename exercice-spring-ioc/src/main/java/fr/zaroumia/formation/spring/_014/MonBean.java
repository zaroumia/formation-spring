package fr.zaroumia.formation.spring._014;

public class MonBean {

	public MonBean() {
		System.out.println("constructeur");
	}

	private void init() {
		System.out.println("je suis la méthode init de la classe MonBean");
	}

	private void destroy() {
		System.out.println("je suis la méthode destroy de la classe MonBean");

	}

}
