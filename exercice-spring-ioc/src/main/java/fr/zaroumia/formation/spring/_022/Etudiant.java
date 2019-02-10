package fr.zaroumia.formation.spring._022;

public class Etudiant {

	public Etudiant() {
		System.out.println("constructeur par defaut de Etudiant");
	}

	private void init() {
		System.out.println("la méthode init est appelée");
	}

	private void destroy() {
		System.out.println("la méthode destroy est appelée");
	}
}
